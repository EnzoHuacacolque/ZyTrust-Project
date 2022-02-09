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
import org.springframework.stereotype.Repository;

import zytrust.sa.project.entity.Factura;

/**
 * Esta interfaz representa al repositorio de la factura y
 * debe ser utilizada para implementar los métodos JPA para el servicio.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Repository
public interface IFacturaRepository extends JpaRepository<Factura, String> {
}
