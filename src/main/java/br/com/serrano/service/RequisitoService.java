package br.com.serrano.service;

import br.com.serrano.model.Requisito;
import br.com.serrano.repository.RequisitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequisitoService {
    @Autowired
    private RequisitoRepository requisitoRepository;
    public List<Requisito> getAllRequisitos(){
        return requisitoRepository.getAllRequisito();
    }
    public Requisito getRequisitoById(Integer id){ return requisitoRepository.getRequisitoById(id);}
    public Requisito createOrUpdateRequisito(Requisito requisito){return requisitoRepository.save(requisito);}
    public String deleteRequisito(Integer id){
        Requisito requisito = requisitoRepository.getRequisitoById(id);
        try {
            if(requisito != null){
                requisitoRepository.deleteById(id);
                return "Requisito deletado com sucesso";
            } else {
                return "Requisito nao encontrado na base de dados";
            }
        }catch(Exception e) {
            return "Erro ao deletar o requisito";
        }
    }
}
