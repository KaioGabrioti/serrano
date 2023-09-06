package br.com.serrano.controller;

import br.com.serrano.model.Unidade;
import br.com.serrano.service.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UnidadeController {
    @Autowired
    UnidadeService unidadeService;
    @GetMapping(value = "/unidades",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Unidade>> getAllUnidades(){
        List<Unidade> areas = unidadeService.getAllUnidades();
        return new ResponseEntity <>(areas, HttpStatus.OK);
    }
    @GetMapping(value = "/unidade/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Unidade> getUnidadeById(@PathVariable Integer id){
        Unidade unidade = unidadeService.getUnidadeById(id);
        return new ResponseEntity <>(unidade, HttpStatus.OK);
    }
    @PostMapping(value = "/unidade",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Unidade> createUnidade(@RequestBody Unidade unidade){
        System.out.print(unidade);
        return new ResponseEntity <>(unidadeService.createOrUpdateUnidade(unidade), HttpStatus.OK);
    }
    @PutMapping(value = "/unidade/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Unidade> updateUnidade(@RequestBody Unidade unidade){
        return new ResponseEntity <>(unidadeService.createOrUpdateUnidade(unidade), HttpStatus.OK);
    }
    @DeleteMapping(value = "/unidade/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateUnidade(@PathVariable Integer id){
        return new ResponseEntity <>(unidadeService.deleteUnidade(id), HttpStatus.OK);
    }
}
