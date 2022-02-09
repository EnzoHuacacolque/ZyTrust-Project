/*
 * @(#)DetalleServiceImpl.java
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

import zytrust.sa.project.entity.Detalle;
import zytrust.sa.project.repository.IDetalleRepository;

/**
 * Esta clase representa las implementaciones de los servicios de los detalles de una factura
 * y debe ser utilizada para implementar las funciones que se va a ejecutar en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Service
public class DetalleServiceImpl implements IDetalleService {

    @Autowired
    /**Repositorio de los detalles*/
    private IDetalleRepository detalleRepository;

    @Override
    @Transactional(readOnly = true)
    /**Busca todos los detalles
     * @return retorna todos los detalles
     */
    public List<Detalle> findAll() {
        return detalleRepository.findAll();
    } //Posiblemente no necesario

    @Override
    @Transactional(readOnly = true)
    /**Clasifica todos los detalles
     * @param sort El filtro para clasificar
     * @return retorna todos los detalles clasificados*/
    public List<Detalle> findAll(Sort sort) {
        return detalleRepository.findAll(sort);
    } //Posiblemente no necesario

    @Override
    @Transactional(readOnly = true)
    /**Busca un detalle por su identificador
     * @param id el identificador
     * @return retorna el detalle identificado*/
    public Optional<Detalle> findbyId(String id) {
        return detalleRepository.findById(id);
    }//Modificarlo a findDetalleByFactura

    @Override
    @Transactional
    /**Guarda un detalle
     * @param detalle el detalle a guardar
     * @return Guarda los datos ingresados del detalle nuevo*/
    public Detalle save(Detalle detalle) {
        return detalleRepository.save(detalle);
    }

    @Override
    @Transactional
    /**Elimina un detalle
     * @param id identificador del detalle
     */
    public void deleteById(String id) {
        detalleRepository.deleteById(id);
    }
}
