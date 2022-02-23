/*
 * @(#)IFacturaService.java
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
import zytrust.sa.project.dto.FacturaDTO;
import zytrust.sa.project.dto.request.FacturaReq;
import zytrust.sa.project.entity.Factura;

/**
 * Esta clase representa los servicios de la factura y
 * debe ser utilizada para declarar las funciones que
 * se van a ejecutar en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

public interface IFacturaService {

    /**Busca todas las facturas*/
    public List<Factura> findAll();

    /**Clasifica todas las facturas
     * @param sort
     */
    public List<Factura> findAll(Sort sort);

    /**Busca una factura por su identificador
     * @param id
     */
    public Optional<Factura> findbyId(String id);

    /**Guarda una factura
     * @param factura
     * @return
     */
    public Factura save(Factura factura);

    /**Guarda una factura mediante Req
     * @param facturaReq
     * @return
     */
    public Factura createReq(FacturaReq facturaReq);

    /**Elimina una factura
     * @param id
     */
    public void deleteById(String id);

    public List<FacturaDTO> findAllFacturaDTO();
}
