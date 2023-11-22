package br.com.serrano.repository;

import br.com.serrano.model.Classe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClasseRepository extends CrudRepository<Classe, Integer> {
    @Query(value = "SELECT * FROM tb_classes", nativeQuery = true)
    List<Classe> getAllClasses();
    @Query(value = "SELECT * FROM tb_classes where id=:id", nativeQuery = true)
    Classe getClasseById(@Param(value = "id") Integer id);
}
