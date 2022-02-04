package zytrust.sa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zytrust.sa.project.entity.Cliente;
import zytrust.sa.project.repository.IClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll(Sort sort) {
        return clienteRepository.findAll(sort);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> findbyId(String id) {
        return clienteRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public void deleteById(String id) {
        clienteRepository.deleteById(id);
    }
}
