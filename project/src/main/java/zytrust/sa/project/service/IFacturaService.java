package zytrust.sa.project.service;

import org.springframework.data.domain.Sort;
import zytrust.sa.project.entity.Factura;

import java.util.List;
import java.util.Optional;

public interface IFacturaService {
    public List<Factura> findAll();

    public List<Factura> findAll(Sort sort);

    public Optional<Factura> findbyId(String id);

    public Factura save(Factura factura);

    public void deleteById(String id);
}
