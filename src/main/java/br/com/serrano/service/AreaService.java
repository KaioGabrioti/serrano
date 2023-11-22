package br.com.serrano.service;

import br.com.serrano.model.Area;
import br.com.serrano.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;
    public List<Area> getAllAreas (){
        return areaRepository.getAllAreas();
    }
    public Area getAreaById(Integer id){ return areaRepository.getAreaById(id);}
    public Area createOrUpdateArea(Area area){return areaRepository.save(area);}
    public String deleteArea(Integer id){
        Area area = areaRepository.getAreaById(id);
        try {
            if(area != null){
                areaRepository.deleteById(id);
                return "Area deletado com sucesso";
            } else {
                return "Area nao encontrada na base de dados";
            }
        }catch(Exception e) {
            return "Erro ao deletar a area";
        }
    }
}
