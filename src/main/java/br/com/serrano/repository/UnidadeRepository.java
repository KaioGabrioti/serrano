package br.com.serrano.repository;

import br.com.serrano.model.Area;
import br.com.serrano.model.Unidade;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnidadeRepository extends CrudRepository<Unidade, Integer> {

    @Query(value = "SELECT * FROM tb_unidades", nativeQuery = true)
    List<Unidade> getAllUnidades();

    @Query(value = "SELECT * FROM tb_unidades where id=:id", nativeQuery = true)
    Unidade getUnidadeById(@Param(value = "id") Integer id);
}
