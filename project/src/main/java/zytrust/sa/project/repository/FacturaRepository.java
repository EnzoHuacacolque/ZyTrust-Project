package zytrust.sa.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zytrust.sa.project.entity.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,String> {
}
