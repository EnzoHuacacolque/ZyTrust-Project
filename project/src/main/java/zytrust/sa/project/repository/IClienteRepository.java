package zytrust.sa.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zytrust.sa.project.entity.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,String> {

}
