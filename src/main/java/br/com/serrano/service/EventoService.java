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
        Evento evento = eventoRepository.getEventoById(id);
        try {
            if(evento != null){
                eventoRepository.deleteById(id);
                return "Evento deletado com sucesso";
            } else {
                return "Evento nao encontrado na base de dados";
            }
        }catch(Exception e) {
            return "Erro ao deletar o evento";
        }
    }
}
