/*
 * @(#)ClienteServiceImpl.java
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

import zytrust.sa.project.entity.Cliente;
import zytrust.sa.project.repository.IClienteRepository;

/**
 * Esta clase representa las implementaciones de los servicios del cliente y debe
 * ser utilizada para implementar las funciones que se va a ejecutar en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    /**Repositorio del Cliente*/
    private IClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    /**Busca a todos los clientes
     * @retun Retorna a todos los clientes
     */
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    } //Posiblemente no será necesario

    @Override
    @Transactional(readOnly = true)
    /**Clasifica a todos los clientes
     * @param sort
     * @retun Retorna a todos los clientes con la clasificación */
    public List<Cliente> findAll(Sort sort) {
        return clienteRepository.findAll(sort);
    }//Posiblemente no será necesario

    @Override
    @Transactional(readOnly = true)
    /**Busca a un cliente por su identificador
     * @param id
     * @return Retorna al cliente identificado por su identificador*/
    public Optional<Cliente> findbyId(String id) {
        return clienteRepository.findById(id);
    }

    @Override
    @Transactional
    /**Guarda al cliente registrado
     * @param cliente
     * @return Guarda los datos ingresados del cliente nuevo
     */
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional
    /**Elimina un cliente registrado
     * @param id
     */
    public void deleteById(String id) {
        clienteRepository.deleteById(id);
    }
}
