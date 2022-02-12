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

import java.util.List;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import zytrust.sa.project.entity.Cliente;
import zytrust.sa.project.service.IClienteService;



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

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(ClienteController.class);

    //Crear un nuevo cliente
    //También se puede usar "ResponseEntity<T>
    /**Creación de un cliente.
     * @return retorna una notificación de creación del cliente
     * @throws Exception retorna una notificación de error*/
    @PostMapping
    public ResponseEntity<Cliente> crearCliente(@RequestBody @Validated Cliente cliente){
        logger.info("creando el cliente de los siguientes datos {}",cliente.toString());
            Cliente clienteRegistrado = clienteService.save(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body(clienteRegistrado);
    }

    @GetMapping
    /**Búsqueda de todos los clientes
     * @return retorna todos los clientes
     * @throws ResponseEntity retorna una notificación en donde comenta
     * que no encontro ningun cliente
     * */
    public ResponseEntity<List<Cliente>> buscarTodosLosClientes(){
        logger.debug("Obteniendo todos los clientes");
        return ResponseEntity.ok(clienteService.findAll());
    }

}
