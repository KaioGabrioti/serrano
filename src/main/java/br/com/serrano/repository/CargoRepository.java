package br.com.serrano.repository;

import br.com.serrano.model.Cargo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {
    @Query(value = "SELECT * FROM tb_cargos", nativeQuery = true)
    List<Cargo> getAllCargos();
    @Query(value = "SELECT * FROM tb_cargos where id=:id", nativeQuery = true)
    Cargo getCargoById(@Param(value = "id") Integer id);
}
