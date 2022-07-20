package com.ap.ap.controller;

import com.ap.ap.entity.Educacion;
import com.ap.ap.service.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getAllEducacion() {
        List<Educacion> educacion = educacionService.findAllEducaciones();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Educacion> getEducacionById(@PathVariable("id") Long id) {
        Educacion educacion = educacionService.findEducacionById(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion){
        Educacion newEducacion= educacionService.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion = educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id){
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    }
