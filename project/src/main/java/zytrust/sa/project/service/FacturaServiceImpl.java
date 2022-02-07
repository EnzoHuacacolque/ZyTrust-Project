/*
 * @(#)FacturaServiceImpl.java
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

import zytrust.sa.project.entity.Factura;
import zytrust.sa.project.repository.IFacturaRepository;

/**
 * Esta clase representa las implementaciones de los servicios de la factura y debe ser utilizada para implementar las
 * funciones que se va a ejecutar en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    /**Repositorio de la factura*/
    private IFacturaRepository facturaRepository;

    @Override
    @Transactional(readOnly = true)
    /**Busca todas las facturas*/
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    /**Clasifica todas las facturas*/
    public List<Factura> findAll(Sort sort) {
        return facturaRepository.findAll(sort);
    }

    @Override
    @Transactional(readOnly = true)
    /**Busca una factura por su identificador*/
    public Optional<Factura> findbyId(String id) {
        return facturaRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    /**Guarda una factura*/
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    @Transactional(readOnly = true)
    /**Elimina una factura*/
    public void deleteById(String id) {
        facturaRepository.deleteById(id);
    }
}
