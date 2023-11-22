package br.com.serrano.controller;

import br.com.serrano.model.Especialidade;
import br.com.serrano.service.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class EspecialidadeController {
    @Autowired
    EspecialidadeService especialidadeService;
    @GetMapping(value = "/especialidades",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Especialidade>> getAllEspecialidades(){
        List<Especialidade> especialidades = especialidadeService.getAllEspecialidades();
        return new ResponseEntity <>(especialidades, HttpStatus.OK);
    }
    @GetMapping(value = "/especialidade/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Especialidade> getEspecialidadeById(@PathVariable Integer id){
        Especialidade especialidade = especialidadeService.getEspecialidadeById(id);
        return new ResponseEntity <>(especialidade, HttpStatus.OK);
    }
    @PostMapping(value = "/especialidade",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Especialidade> createOrUpdateEspecialidade(@RequestBody Especialidade unidade){
        return new ResponseEntity <>(especialidadeService.createOrUpdateEspecialidade(unidade), HttpStatus.OK);
    }
    @PutMapping(value = "/especialidade/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Especialidade> updateEspecialidade(@RequestBody Especialidade especialidade){
        return new ResponseEntity <>(especialidadeService.createOrUpdateEspecialidade(especialidade), HttpStatus.OK);
    }
    @DeleteMapping(value = "/especialidade/{id}")
    public ResponseEntity<String> deleteEspecialidade(@PathVariable Integer id){
        return new ResponseEntity <>(especialidadeService.deleteEspecialidade(id), HttpStatus.OK);
    }
}
