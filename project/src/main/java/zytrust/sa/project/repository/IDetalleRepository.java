package zytrust.sa.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zytrust.sa.project.entity.Detalle;

@Repository
public interface IDetalleRepository extends JpaRepository<Detalle,String> {
}
