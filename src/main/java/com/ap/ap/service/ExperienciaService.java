package com.ap.ap.service;

import com.ap.ap.entity.Experiencia;
import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> findAllExperiencia() {
        return experienciaRepo.findAll();
    }

    public Experiencia updateExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public void deleteExperiencia(Long id) {
        experienciaRepo.deleteExperienciaById(id);
    }

    public Experiencia findExperienciaById(Long id) {
        return experienciaRepo.findExperienciaById(id).orElseThrow(() -> new UserNotFoundException("La experiencia de id" + id + "no fue encontrado"));

    }
}
