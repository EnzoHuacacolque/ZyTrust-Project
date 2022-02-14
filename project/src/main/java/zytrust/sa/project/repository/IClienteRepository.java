/*
 * @(#)IClienteRepository.java
 *
 * Copyright 2022 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package zytrust.sa.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import zytrust.sa.project.dto.ClienteDTO;
import zytrust.sa.project.entity.Cliente;



/**
 * Esta interfaz representa al repositorio del Cliente y debe ser
 * utilizada para implementar los métodos JPA para el servicio.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, String> {

    @Query(value = "SELECT cl.id AS idCliente, cl.nombre AS nombre,"
            +" cl.tipoDoc AS tipoDoc, cl.numDoc AS numDoc,"
            +" cl.correo AS correo, cl.telefono AS telefono,"
            + "(SELECT COUNT(fact) from Factura fact WHERE fact.cliente.id = cl.id)"
            +" AS numFacturas, cl.apellido AS apellido FROM Cliente cl group by cl")
    List<ClienteDTO> findAllClienteDTO();

    @Query(value = "SELECT cl.id AS idCliente, cl.nombre AS nombre,"
            +" cl.tipoDoc AS tipoDocumento, cl.numDoc AS nroDocumento,"
            +"cl.correo AS correo, cl.telefono AS telefono,"
            +"  cl.apellido AS apellido FROM Cliente cl group by cl")
    Optional<ClienteDTO> findByIdClienteDTO(@Param("id")String id);

}
