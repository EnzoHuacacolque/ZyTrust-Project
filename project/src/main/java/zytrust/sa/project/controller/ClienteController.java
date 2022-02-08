/*
 * @(#)ClienteController.java
 *
 * Copyright 2022 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package zytrust.sa.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zytrust.sa.project.entity.Cliente;
import zytrust.sa.project.service.IClienteService;

import java.net.URI;

/**
 * Esta clase representa al controlador del Cliente y debe ser usada para interactuar
 * con el servicio del Cliente mediante solicitudes en Http.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    /**Servicio del Cliente*/
    private IClienteService clienteService;

    //Crear un nuevo cliente
    //También se puede usar "ResponseEntity<T>
    /**Creación de un cliente.
     * @return retorna una notificación de creación del cliente
     * @throws Exception retorna una notificación de error*/
    @PostMapping
    public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente){

        try {
            Cliente cliente_registrado = clienteService.save(cliente);
            return ResponseEntity.created(new URI("/facturas" + cliente_registrado.getId())).body(cliente_registrado);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
