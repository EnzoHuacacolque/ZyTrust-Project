package zytrust.sa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import zytrust.sa.project.entity.Detalle;
import zytrust.sa.project.repository.IDetalleRepository;


import java.util.List;
import java.util.Optional;

@Service
public class DetalleServiceImpl implements IDetalleService {

    @Autowired
    private IDetalleRepository detalleRepository;

    @Override
    public List<Detalle> findAll() {
        return detalleRepository.findAll();
    }

    @Override
    public List<Detalle> findAll(Sort sort) {
        return detalleRepository.findAll(sort);
    }

    @Override
    public Optional<Detalle> findbyId(String id) {
        return detalleRepository.findById(id);
    }

    @Override
    public Detalle save(Detalle detalle) {
        return detalleRepository.save(detalle);
    }

    @Override
    public void deleteById(String id) {
        detalleRepository.deleteById(id);
    }
}
