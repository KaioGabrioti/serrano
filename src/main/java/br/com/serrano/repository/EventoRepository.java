package br.com.serrano.repository;

import br.com.serrano.model.Evento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventoRepository extends CrudRepository<Evento, Integer> {
    @Query(value = "SELECT * FROM tb_eventos", nativeQuery = true)
    List<Evento> getAllEventos();
    @Query(value = "SELECT * FROM tb_eventos where id=:id", nativeQuery = true)
    Evento getEventoById(@Param(value = "id") Integer id);
}
