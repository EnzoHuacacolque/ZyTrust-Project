package zytrust.sa.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zytrust.sa.project.service.IClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;


}
