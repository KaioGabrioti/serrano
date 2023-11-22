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
        Cargo cargo = cargoRepository.getCargoById(id);
        try {
            if(cargo != null){
                cargoRepository.deleteById(id);
                return "Cargo deletado com sucesso";
            } else {
                return "Cargo nao encontrado na base de dados";
            }
        }catch(Exception e) {
            return "Erro ao deletar o cargo";
        }
    }
}
