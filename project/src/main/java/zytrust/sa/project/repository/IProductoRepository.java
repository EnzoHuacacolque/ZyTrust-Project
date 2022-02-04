package zytrust.sa.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zytrust.sa.project.entity.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,String> {
}