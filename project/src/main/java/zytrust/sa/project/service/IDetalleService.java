/*
 * @(#)IDetalleService.java
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

import zytrust.sa.project.entity.Detalle;

/**
 * Esta clase representa los servicios de los detalles de la factura y debe ser utilizada para declarar las funciones que
 * se van a ejecutar en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

public interface IDetalleService {

    /**Busca todos los detalles*/
    public List<Detalle> findAll();

    /**Clasifica todos los detalles
     * @param sort
     */
    public List<Detalle> findAll(Sort sort);

    /**Busca un detalle por su identificador
     * @param id
     */
    public Optional<Detalle> findbyId(String id);

    /**Guarda un detalle
     * @param detalle
     */
    public Detalle save(Detalle detalle);

    /**Elimina un detalle
     * @param id
     */
    public void deleteById(String id);
}
