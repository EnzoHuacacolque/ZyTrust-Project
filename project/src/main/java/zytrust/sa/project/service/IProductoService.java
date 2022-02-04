package zytrust.sa.project.service;

import org.springframework.data.domain.Sort;
import zytrust.sa.project.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    public List<Producto> findAll();

    public List<Producto> findAll(Sort sort);

    public Optional<Producto> findbyId(String id);

    public Producto save(Producto producto);

    public void deleteById(String id);

}
