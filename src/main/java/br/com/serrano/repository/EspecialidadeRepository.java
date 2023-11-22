package br.com.serrano.repository;

import br.com.serrano.model.Especialidade;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EspecialidadeRepository extends CrudRepository<Especialidade, Integer> {
    @Query(value = "SELECT * FROM tb_especialidades", nativeQuery = true)
    List<Especialidade> getAllEspecialidades();
    @Query(value = "SELECT * FROM tb_especialidades where id=:id", nativeQuery = true)
    Especialidade getEspecialidadeById(@Param(value = "id") Integer id);
}
