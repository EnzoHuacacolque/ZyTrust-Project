package zytrust.sa.project.service;

import org.springframework.data.domain.Sort;
import zytrust.sa.project.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    public List<Cliente> findAll();

    public List<Cliente> findAll(Sort sort);

    public Optional<Cliente> findbyId(String id);

    public Cliente save(Cliente cliente);

    public void deleteById(String id);

}
