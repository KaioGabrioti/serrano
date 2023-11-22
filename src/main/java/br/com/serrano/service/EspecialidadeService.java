package br.com.serrano.service;

import br.com.serrano.model.Especialidade;
import br.com.serrano.repository.EspecialidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EspecialidadeService {
    @Autowired
    private EspecialidadeRepository especialidadeRepository;
    public List<Especialidade> getAllEspecialidades (){
        return especialidadeRepository.getAllEspecialidades();
    }
    public Especialidade getEspecialidadeById(Integer id){ return especialidadeRepository.getEspecialidadeById(id);}
    public Especialidade createOrUpdateEspecialidade(Especialidade unidade){return especialidadeRepository.save(unidade);}
    public String deleteEspecialidade(Integer id){
        Especialidade especialidade = especialidadeRepository.getEspecialidadeById(id);
        try {
            if(especialidade != null){
                especialidadeRepository.deleteById(id);
                return "Especialidade deletado com sucesso";
            } else {
                return "Especialidade nao encontrada na base de dados";
            }
        }catch(Exception e) {
            return "Erro ao deletar o especialidade";
        }
    }
}
