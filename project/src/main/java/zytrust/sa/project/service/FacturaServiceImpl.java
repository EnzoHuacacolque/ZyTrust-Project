package zytrust.sa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zytrust.sa.project.entity.Factura;
import zytrust.sa.project.repository.IFacturaRepository;


import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    private IFacturaRepository facturaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Factura> findAll(Sort sort) {
        return facturaRepository.findAll(sort);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Factura> findbyId(String id) {
        return facturaRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    @Transactional(readOnly = true)
    public void deleteById(String id) {
        facturaRepository.deleteById(id);
    }
}
