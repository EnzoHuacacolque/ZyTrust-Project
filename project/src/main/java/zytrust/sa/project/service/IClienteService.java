/*
 * @(#)IClienteService.java
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

import zytrust.sa.project.entity.Cliente;

/**
 * Esta clase representa los servicios del cliente y debe
 * ser utilizada para declarar las funciones que se va a ejecutar
 * en el controlador.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

public interface IClienteService {

    /**Busca a todos los clientes*/
    public List<Cliente> findAll(); //Posiblemente no necesario

    /**Clasifica a todos los clientes
     * @param sort
     */
    public List<Cliente> findAll(Sort sort); //Posiblemente no necesario

    /**Busca a un cliente por su identificador
     * @param id
     */
    public Optional<Cliente> findbyId(String id);

    /**Guarda al cliente registrado
     * @param cliente
     */
    public Cliente save(Cliente cliente);

    /**Elimina un cliente registrado
     * @param id
     */
    public void deleteById(String id);

}
