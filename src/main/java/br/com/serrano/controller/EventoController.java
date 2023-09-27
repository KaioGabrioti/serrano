package br.com.serrano.controller;

import br.com.serrano.model.Evento;
import br.com.serrano.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class EventoController {
    @Autowired
    EventoService eventoService;
    @GetMapping(value = "/eventos",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Evento>> getAllEventos(){
        List<Evento> eventos = eventoService.getAllEventos();
        return new ResponseEntity <>(eventos, HttpStatus.OK);
    }
    @GetMapping(value = "/evento/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Evento> getEventoById(@PathVariable Integer id){
        Evento evento = eventoService.getEventoById(id);
        return new ResponseEntity <>(evento, HttpStatus.OK);
    }
    @PostMapping(value = "/evento",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Evento> createOrUpdateEvento(@RequestBody Evento evento){
        return new ResponseEntity <>(eventoService.createOrUpdateEvento(evento), HttpStatus.OK);
    }
    @PutMapping(value = "/evento/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Evento> updateUnidade(@RequestBody Evento evento){
        return new ResponseEntity <>(eventoService.createOrUpdateEvento(evento), HttpStatus.OK);
    }
    @DeleteMapping(value = "/evento/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteEvento(@PathVariable Integer id) {
        return new ResponseEntity<>(eventoService.deleteEvento(id), HttpStatus.OK);
    }
}
