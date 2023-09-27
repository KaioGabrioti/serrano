package br.com.serrano.service;

import br.com.serrano.model.Evento;
import br.com.serrano.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;
    public List<Evento> getAllEventos (){
        return eventoRepository.getAllEventos();
    }
    public Evento getEventoById(Integer id){ return eventoRepository.getEventoById(id);}
    public Evento createOrUpdateEvento(Evento evento){return eventoRepository.save(evento);}
    public String deleteEvento(Integer id){
        try {
            eventoRepository.deleteById(id);
            return "Unidade deletado com sucesso";
        }catch(Exception e) {
            return "Erro ao deletar o unidade";
        }
    }
}
