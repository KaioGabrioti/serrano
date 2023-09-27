package br.com.serrano.controller;

import br.com.serrano.model.Requisito;
import br.com.serrano.service.RequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class RequisitoController {
    @Autowired
    RequisitoService requisitoService;
    @GetMapping(value = "/requisitos",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Requisito>> getAllRequisitos(){
        List<Requisito> requisitos = requisitoService.getAllRequisitos();
        return new ResponseEntity <>(requisitos, HttpStatus.OK);
    }
    @GetMapping(value = "/requisito/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Requisito> getRequisitoById(@PathVariable Integer id){
        Requisito requisito = requisitoService.getRequisitoById(id);
        return new ResponseEntity <>(requisito, HttpStatus.OK);
    }
    @PostMapping(value = "/requisito",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Requisito> createOrUpdateUnidade(@RequestBody Requisito requisito){
        return new ResponseEntity <>(requisitoService.createOrUpdateRequisito(requisito), HttpStatus.OK);
}
    @PutMapping(value = "/requisito/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Requisito> updateRequisito(@RequestBody Requisito requisito){
        return new ResponseEntity <>(requisitoService.createOrUpdateRequisito(requisito), HttpStatus.OK);
    }
    @DeleteMapping(value = "/requisito/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteRequisito(@PathVariable Integer id){
        return new ResponseEntity <>(requisitoService.deleteRequisito(id), HttpStatus.OK);
    }
}
