package br.com.serrano.service;

import br.com.serrano.model.Inventario;
import br.com.serrano.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class InventarioService {
    @Autowired
    private InventarioRepository inventarioRepository;
    public List<Inventario> getAllInventarioItems(){
        return inventarioRepository.getAllInventarioItems();
    }
    public Inventario getInventarioById(Integer id){ return inventarioRepository.getInventarioById(id);}
    public Inventario createOrUpdateInventario(Inventario inventario){return inventarioRepository.save(inventario);}
    public String deleteInventario(Integer id){
        try {
            inventarioRepository.deleteById(id);
            return "Inventario deletado com sucesso";
        }catch(Exception e) {
            return "Erro ao deletar o inventario";
        }
    }
}
