/*
 * @(#)FacturaController.java
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
import org.springframework.web.bind.annotation.*;
import zytrust.sa.project.dto.ClienteDTO;
import zytrust.sa.project.dto.FacturaDTO;
import zytrust.sa.project.entity.Factura;
import zytrust.sa.project.service.IFacturaService;

/**
 * Esta clase representa al controlador de factura y debe ser usada para interactuar
 * con el servicio de factura mediante solicitudes en Http.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    /**Servicio de Factura*/
    private IFacturaService facturaService;

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(FacturaController.class);

    //Crear una nueva factura
    /**Creación de una nueva Factura
     * @return retorna el mensaje de registro del usuario
     * @throws Exception retorna un mensaje de error*/
    @PostMapping
    public ResponseEntity<?> crearFactura(@RequestBody Factura factura) {
            logger.info("creando la factura de los siguientes datos {}",factura.toString());
            return ResponseEntity.status(HttpStatus.CREATED).body(facturaService.save(factura));
    }
    //Buscar todas las facturas
    @GetMapping
    /**Búsqueda de todas las facturas
     * @return retorna todas las facturas
     * @throws ResponseEntity retorna una notificación en donde comenta
     * que no encontró ninguna factura
     * */
    public ResponseEntity<List<Factura>> buscarTodasLasFacturas() {
        logger.debug("Obteniendo todas las facturas");
        return ResponseEntity.ok(facturaService.findAll());
    }


        //Buscar una factura por Id
    /**Búsqueda de una factura mediante su identificador
     * @return retorna la factura encontrada
     * @throws ResponseEntity retorna una notificación en donde comenta
     * que no encontró la factura
     * */
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarFacturaPorId(@PathVariable(value ="id") String factura_id){
        logger.debug("Obteniendo la factura a identificar");
        return ResponseEntity.ok(facturaService.findbyId(factura_id));
    }

    @GetMapping(value = "DTO")
    /**Búsqueda de todas las facturas DTO
     * @return retorna todas las facturas DTO
     * @throws ResponseEntity retorna una notificación en donde comenta
     * que no encontro ninguna factura DTO
     * */
    public List<FacturaDTO> buscarFacturaDTO(){
        logger.debug("Obteniendo las Facturas DTO");
        return facturaService.findAllFacturaDTO();
    }


}
