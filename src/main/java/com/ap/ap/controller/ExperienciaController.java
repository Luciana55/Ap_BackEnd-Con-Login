package com.ap.ap.controller;

import com.ap.ap.entity.Experiencia;
import com.ap.ap.service.ExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> getAllExperiencia() {
        List<Experiencia> experiencia = experienciaService.findAllExperiencia();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Experiencia> getExperienciaById(@PathVariable("id") Long id) {
        Experiencia experiencia = experienciaService.findExperienciaById(id);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia){
        Experiencia newExperiencia= experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Experiencia> updateExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia = experienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable("id") Long id){
        experienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
