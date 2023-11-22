package br.com.serrano.service;

import br.com.serrano.model.Unidade;
import br.com.serrano.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UnidadeService {
    @Autowired
    private UnidadeRepository unidadeRepository;
    public List<Unidade> getAllUnidades (){
        return unidadeRepository.getAllUnidades();
    }
    public Unidade getUnidadeById(Integer id){ return unidadeRepository.getUnidadeById(id);}
    public Unidade createOrUpdateUnidade(Unidade unidade){return unidadeRepository.save(unidade);}
    public String deleteUnidade(Integer id){
        Unidade unidade = unidadeRepository.getUnidadeById(id);
        try {
            if(unidade != null){
                unidadeRepository.deleteById(id);
                return "Unidade deletado com sucesso";
            } else {
                return "Unidade nao encontrado na base de dados";
            }
        }catch(Exception e) {
            return "Erro ao deletar o unidade";
        }
    }
}
