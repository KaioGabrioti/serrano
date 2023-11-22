package br.com.serrano.controller;

import br.com.serrano.model.Inventario;
import br.com.serrano.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class InventarioController {
    @Autowired
    InventarioService inventarioService;
    @GetMapping(value = "/inventarios",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Inventario>> getAllInventarioItems(){
        List<Inventario> inventarios = inventarioService.getAllInventarioItems();
        return new ResponseEntity <>(inventarios, HttpStatus.OK);
    }
    @GetMapping(value = "/inventario/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Inventario> getInventarioById(@PathVariable Integer id){
        Inventario inventario = inventarioService.getInventarioById(id);
        return new ResponseEntity <>(inventario, HttpStatus.OK);
    }
    @PostMapping(value = "/inventario",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Inventario> createOrUpdateInventario(@RequestBody Inventario inventario){
        return new ResponseEntity <>(inventarioService.createOrUpdateInventario(inventario), HttpStatus.OK);
    }
    @PutMapping(value = "/inventario/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Inventario> updateinventarioService(@RequestBody Inventario inventario){
        return new ResponseEntity <>(inventarioService.createOrUpdateInventario(inventario), HttpStatus.OK);
    }
    @DeleteMapping(value = "/inventario/{id}")
    public ResponseEntity<String> deleteInventario(@PathVariable Integer id){
        return new ResponseEntity <>(inventarioService.deleteInventario(id), HttpStatus.OK);
    }
}
