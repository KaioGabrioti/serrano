package br.com.serrano.repository;

import br.com.serrano.model.Requisito;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RequisitoRepository extends CrudRepository<Requisito, Integer> {
    @Query(value = "SELECT * FROM tb_requisito", nativeQuery = true)
    List<Requisito> getAllRequisito();
    @Query(value = "SELECT * FROM tb_requisito where id=:id", nativeQuery = true)
    Requisito getRequisitoById(@Param(value = "id") Integer id);
}
