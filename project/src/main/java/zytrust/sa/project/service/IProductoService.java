/*
 * @(#)IProductoService.java
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

import org.springframework.data.domain.Sort;

import zytrust.sa.project.entity.Producto;

/**
 * Esta clase representa los servicios del producto y debe ser utilizada para declarar las funciones que
 * se va a ejecutar en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

public interface IProductoService {

    /**Busca todos los productos*/
    public List<Producto> findAll();

    /**Clasifica todos los productos*/
    public List<Producto> findAll(Sort sort);

    /**Busca un producto por su identificador*/
    public Optional<Producto> findbyId(String id);

    /**Guarda un producto*/
    public Producto save(Producto producto);

    /**Elimina un producto*/
    public void deleteById(String id);

}
