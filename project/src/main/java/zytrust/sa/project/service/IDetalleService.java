package zytrust.sa.project.service;

import org.springframework.data.domain.Sort;
import zytrust.sa.project.entity.Detalle;

import java.util.List;
import java.util.Optional;

public interface IDetalleService {
    public List<Detalle> findAll();

    public List<Detalle> findAll(Sort sort);

    public Optional<Detalle> findbyId(String id);

    public Detalle save(Detalle detalle);

    public void deleteById(String id);
}
