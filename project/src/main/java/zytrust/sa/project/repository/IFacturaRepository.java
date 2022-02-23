/*
 * @(#)IFacturaRepository.java
 *
 * Copyright 2022 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package zytrust.sa.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import zytrust.sa.project.dto.FacturaDTO;
import zytrust.sa.project.entity.Factura;

import java.util.List;

/**
 * Esta interfaz representa al repositorio de la factura y
 * debe ser utilizada para implementar los métodos JPA para el servicio.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Repository
public interface IFacturaRepository extends JpaRepository<Factura, String> {

   @Query(value = "SELECT fact.id AS idFactura,  fact.descripcion AS descripcion,"
            +"fact.fechaEmision AS fechaEmision, fact.fechaPago AS fechaPago,"
            +"fact.cliente.id AS clienteId, fact.codigoNumerico AS codigoNumerico,"
            +"(SELECT COUNT(detfact) from Detalle detfact "
            + "WHERE detfact.factura.id = fact.id)"
            +" AS numProductos, fact.estado AS estado FROM Factura fact group by fact")
    List<FacturaDTO> findAllFacturaDTO();

    @Query(value = "SELECT fact.id AS idFactura,  fact.descripcion AS descripcion,"
            +"fact.fechaEmision AS fechaEmision, fact.fechaPago AS fechaPago,"
            +"fact.cliente.id AS clienteId, fact.codigoNumerico AS codigoNumerico,"
            +"(SELECT COUNT(detfact) from Detalle detfact "
            + "WHERE detfact.factura.id = fact.id)"
            +" AS numProductos, fact.estado AS estado FROM Factura fact "
            + "WHERE fact.cliente.id = :clienteId group by fact")
    List<FacturaDTO> findFacturaDTOByClienteId(@Param("clienteId") String clienteId);
}
