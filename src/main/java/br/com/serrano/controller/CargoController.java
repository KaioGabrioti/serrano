package br.com.serrano.controller;

import br.com.serrano.model.Cargo;
import br.com.serrano.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CargoController {
    @Autowired
    CargoService cargoService;
    @GetMapping(value = "/cargos",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cargo>> getAllCargos(){
        List<Cargo> cargos = cargoService.getAllCargos();
        return new ResponseEntity <>(cargos, HttpStatus.OK);
    }
    @GetMapping(value = "/cargo/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cargo> getCargoById(@PathVariable Integer id){
        Cargo cargo = cargoService.getCargoById(id);
        return new ResponseEntity <>(cargo, HttpStatus.OK);
    }
    @PostMapping(value = "/cargo",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cargo> createOrUpdateCargo(@RequestBody Cargo cargo){
        return new ResponseEntity <>(cargoService.createOrUpdateCargo(cargo), HttpStatus.OK);
    }
    @PutMapping(value = "/cargo/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cargo> updateCargo(@RequestBody Cargo cargo){
        return new ResponseEntity <>(cargoService.createOrUpdateCargo(cargo), HttpStatus.OK);
    }
    @DeleteMapping(value = "/cargo/{id}")
    public ResponseEntity<String> deleteCargo(@PathVariable Integer id){
        return new ResponseEntity <>(cargoService.deleteCargo(id), HttpStatus.OK);
    }
}
