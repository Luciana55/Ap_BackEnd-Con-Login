package com.ap.ap.service;

import com.ap.ap.entity.Proyectos;
import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.repository.ProyectosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepo proyectosRepo;

    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }


    public Proyectos addProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public List<Proyectos> findAllProyectos() {
        return proyectosRepo.findAll();
    }

    public Proyectos updateProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public void deleteProyectos(Long id) {
        proyectosRepo.deleteProyectosById(id);
    }

    public Proyectos findProyectosById(Long id) {
        return proyectosRepo.findProyectosById(id).orElseThrow(() -> new UserNotFoundException("Proyecto de id" + id + "no fue encontrado"));

    }
}
