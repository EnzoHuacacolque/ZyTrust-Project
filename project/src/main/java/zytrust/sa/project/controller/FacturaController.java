package zytrust.sa.project.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zytrust.sa.project.entity.Factura;
import zytrust.sa.project.service.IFacturaService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private IFacturaService facturaService;

    //Crear una nueva factura
    @PostMapping
    public ResponseEntity<?> crearFactura(@RequestBody Factura factura){
        //return ResponseEntity.status(HttpStatus.CREATED).body(facturaService.save(factura));

        try {
            Factura factura_registrada = facturaService.save(factura);
            return ResponseEntity.created(new URI("/api/facturas" + factura_registrada.getId())).body(factura_registrada);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    //Leer todas las facturas
    @GetMapping
    public ResponseEntity<List<Factura>> buscarFacturas(@PathVariable(value = "id")String factura_id){
        return ResponseEntity.ok(facturaService.findAll());
    }

    //Leer una factura por Id
    @GetMapping("/{id}")
    public ResponseEntity<List<Factura>> buscarFactura(@PathVariable(value ="id") String factura_id){
        Optional<Factura> _factura = facturaService.findbyId(factura_id);

        if(!_factura.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(_factura);
    }



}
