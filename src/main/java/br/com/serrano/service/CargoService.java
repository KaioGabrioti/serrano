package br.com.serrano.service;

import br.com.serrano.model.Cargo;
import br.com.serrano.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CargoService {
    @Autowired
    private CargoRepository cargoRepository;
    public List<Cargo> getAllCargos (){
        return cargoRepository.getAllCargos();
    }
    public Cargo getCargoById(Integer id){ return cargoRepository.getCargoById(id);}
    public Cargo createOrUpdateCargo(Cargo cargo){return cargoRepository.save(cargo);}
    public String deleteCargo(Integer id){
        try {
            cargoRepository.deleteById(id);
            return "Cargo deletado com sucesso";
        }catch(Exception e) {
            return "Erro ao deletar o cargo";
        }
    }
}
