package br.com.serrano.controller;

import br.com.serrano.model.Classe;
import br.com.serrano.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ClasseController {
    @Autowired
    ClasseService classeService;
    @GetMapping(value = "/classes",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Classe>> getAllClasses(){
        List<Classe> classes = classeService.getAllClasses();
        return new ResponseEntity <>(classes, HttpStatus.OK);
    }
    @GetMapping(value = "/classe/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Classe> getClasseById(@PathVariable Integer id){
        Classe classe = classeService.getClasseById(id);
        return new ResponseEntity <>(classe, HttpStatus.OK);
    }
    @PostMapping(value = "/classe",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Classe> createOrUpdateClasse(@RequestBody Classe classe){
        return new ResponseEntity <>(classeService.createOrUpdateClasse(classe), HttpStatus.OK);
    }
    @PutMapping(value = "/classe/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Classe> updateClasse(@RequestBody Classe classe){
        return new ResponseEntity <>(classeService.createOrUpdateClasse(classe), HttpStatus.OK);
    }
    @DeleteMapping(value = "/classe/{id}")
    public ResponseEntity<String> deleteClasse(@PathVariable Integer id){
        return new ResponseEntity <>(classeService.deleteClasse(id), HttpStatus.OK);
    }
}
