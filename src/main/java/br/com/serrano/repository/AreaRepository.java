package br.com.serrano.repository;

import br.com.serrano.model.Area;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AreaRepository extends CrudRepository<Area, Integer> {
    @Query(value = "SELECT * FROM tb_areas", nativeQuery = true)
    List<Area> getAllAreas();
    @Query(value = "SELECT * FROM tb_areas where id=:id", nativeQuery = true)
    Area getAreaById(@Param(value = "id") Integer id);
}
