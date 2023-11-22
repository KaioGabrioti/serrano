package br.com.serrano.controller;

import br.com.serrano.model.Area;
import br.com.serrano.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AreaController {
    @Autowired
    AreaService areaService;
    @GetMapping(value = "/areas",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Area>> getAllAreas(){
        List<Area> areas = areaService.getAllAreas();
        return new ResponseEntity <>(areas, HttpStatus.OK);
    }
    @GetMapping(value = "/area/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Area> getAreaById(@PathVariable Integer id){
        Area area = areaService.getAreaById(id);
        return new ResponseEntity <>(area, HttpStatus.OK);
    }
    @PostMapping(value = "/area",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Area> createOrUpdateArea(@RequestBody Area area){
        return new ResponseEntity <>(areaService.createOrUpdateArea(area), HttpStatus.OK);
    }
    @PutMapping(value = "/area/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Area> updateArea(@RequestBody Area area){
        return new ResponseEntity <>(areaService.createOrUpdateArea(area), HttpStatus.OK);
    }
    @DeleteMapping(value = "/area/{id}")
    public ResponseEntity<String> deleteArea(@PathVariable Integer id){
        return new ResponseEntity <>(areaService.deleteArea(id), HttpStatus.OK);
    }
}
