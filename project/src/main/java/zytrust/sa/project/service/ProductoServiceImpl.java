/*
 * @(#)ProductoServiceImpl.java
 *
 * Copyright 2022 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */

package zytrust.sa.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zytrust.sa.project.entity.Producto;
import zytrust.sa.project.repository.IProductoRepository;

/**
 * Esta clase representa las implementaciones de los servicios del cliente y
 * debe ser utilizada para implementar las
 * funciones que se va a ejecutar en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    /**Repositorio del producto*/
    private IProductoRepository productoRepository;

    @Override
    @Transactional(readOnly = true)
    /**Busca todos los productos*/
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    /**Clasifica todos los productos
     *
     */
    public List<Producto> findAll(Sort sort) {
        return productoRepository.findAll(sort);
    }

    @Override
    @Transactional(readOnly = true)
    /**Busca un producto por su identificador
     *
     */
    public Optional<Producto> findbyId(String id) {
        return productoRepository.findById(id);
    }

    @Override
    @Transactional
    /**Guarda un producto
     * @param producto
     * @return Guarda los datos ingresados del producto nuevo
     */
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    @Transactional
    /**Elimina un producto
     * @param id
     */
    public void deleteById(String id) {
        productoRepository.deleteById(id);
    }
}
