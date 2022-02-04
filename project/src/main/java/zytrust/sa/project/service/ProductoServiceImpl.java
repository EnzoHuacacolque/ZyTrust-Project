package zytrust.sa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zytrust.sa.project.entity.Producto;
import zytrust.sa.project.repository.IProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll(Sort sort) {
        return productoRepository.findAll(sort);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Producto> findbyId(String id) {
        return productoRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public void deleteById(String id) {
        productoRepository.deleteById(id);
    }
}
