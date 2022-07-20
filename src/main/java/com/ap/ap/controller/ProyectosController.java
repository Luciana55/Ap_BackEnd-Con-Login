package com.ap.ap.controller;

import com.ap.ap.entity.Proyectos;
import com.ap.ap.service.ProyectosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {
    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> getAllProyectos() {
        List<Proyectos> proyectos = proyectosService.findAllProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Proyectos> getProyectosById(@PathVariable("id") Long id) {
        Proyectos proyectos = proyectosService.findProyectosById(id);
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Proyectos> addProyectos(@RequestBody Proyectos proyectos){
        Proyectos newProyectos= proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(newProyectos, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Proyectos> updateProyectos(@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = proyectosService.updateProyectos(proyectos);
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyectos(@PathVariable("id") Long id) {
        proyectosService.deleteProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
