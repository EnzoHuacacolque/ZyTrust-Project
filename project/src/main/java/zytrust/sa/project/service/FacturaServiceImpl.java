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

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zytrust.sa.project.dto.FacturaDTO;
import zytrust.sa.project.dto.request.FacturaReq;
import zytrust.sa.project.entity.Cliente;
import zytrust.sa.project.entity.Factura;
import zytrust.sa.project.exceptions.CodigoError;
import zytrust.sa.project.exceptions.ZyTrustException;
import zytrust.sa.project.repository.IClienteRepository;
import zytrust.sa.project.repository.IFacturaRepository;

/**
 * Esta clase representa las implementaciones de los servicios de la factura y
 * debe ser utilizada para implementar las funciones que se va a ejecutar en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    /**Repositorio de la factura*/
    private IFacturaRepository facturaRepository;

    @Autowired
    /**Repositorio del cliente*/
    private IClienteRepository clienteRepository;

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(FacturaServiceImpl.class);

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

        //Validar la existencia de la factura
        Optional<Factura> facturaIngresada = facturaRepository.findById(id);
        if(facturaIngresada.isEmpty()){
            throw new ZyTrustException(CodigoError.FACTURA_NO_EXISTE);
        }

        //Busqueda de la factura
        return facturaRepository.findById(id);
    }

    @Override
    @Transactional
    /**Guarda una factura
     * @return Guarda los datos ingresados de la factura nueva
     */
    public Factura save(Factura factura) {

        //Validar la existencia de la factura
        Optional<Factura> facturaIngresada = facturaRepository.findById(factura.getId());
        if(facturaIngresada.isPresent()){
            logger.debug("El identificador insertado ya esta siendo utilizado");
            throw new ZyTrustException(CodigoError.ID_UTILIZADO);
        }

            //Crear Factura
        try {
            return facturaRepository.save(factura);
        }catch (Exception e){
            logger.debug("No se pudo almacenar la factura");
            throw new ZyTrustException(CodigoError.PROBLEMAS_ALMACENAR_FACTURA);
        }



    }

    @Override
    @Transactional
    public Factura createReq(FacturaReq facturaReq) {
        //Validar la existencia del cliente
        Optional<Cliente> clienteIngresado = clienteRepository.findById(facturaReq.getCliente_id());
         if(clienteIngresado.isEmpty()){
            logger.debug("No se encontró al cliente con el identificador {}",facturaReq.getCliente_id());
            throw new ZyTrustException(CodigoError.CLIENTE_NO_EXISTE);
         }

        Factura facturaCreada = new Factura();



        return null;
    }

    @Override
    @Transactional
    /**Elimina una factura*/
    public void deleteById(String id) {
        facturaRepository.deleteById(id);
    }

    @Override
    public List<FacturaDTO> findAllFacturaDTO() {
        return facturaRepository.findAllFacturaDTO();
    }


}
