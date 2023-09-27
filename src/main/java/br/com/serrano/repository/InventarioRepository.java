package br.com.serrano.repository;

import br.com.serrano.model.Inventario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface InventarioRepository extends CrudRepository<Inventario, Integer> {
    @Query(value = "SELECT * FROM tb_inventario", nativeQuery = true)
    List<Inventario> getAllInventarioItems();
    @Query(value = "SELECT * FROM tb_inventario where id=:id", nativeQuery = true)
    Inventario getInventarioById(@Param(value = "id") Integer id);
}
