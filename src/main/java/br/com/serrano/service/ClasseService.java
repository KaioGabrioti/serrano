package br.com.serrano.service;

import br.com.serrano.model.Classe;
import br.com.serrano.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ClasseService {
    @Autowired
    private ClasseRepository classeRepository;
    public List<Classe> getAllClasses(){
        return classeRepository.getAllClasses();
    }
    public Classe getClasseById(Integer id){ return classeRepository.getClasseById(id);}
    public Classe createOrUpdateClasse(Classe classe){return classeRepository.save(classe);}
    public String deleteClasse(Integer id){
        try {
            classeRepository.deleteById(id);
            return "Classe deletado com sucesso";
        }catch(Exception e) {
            return "Erro ao deletar o classe";
        }
    }
}
