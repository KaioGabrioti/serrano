package br.com.serrano.controller;

import br.com.serrano.model.Area;
import br.com.serrano.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Area> getAreaById(@RequestParam Integer id){
        Area area = areaService.getAreaById(id);
        return new ResponseEntity <>(area, HttpStatus.OK);
    }
}
