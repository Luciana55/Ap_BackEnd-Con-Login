package com.ap.ap.service;

import com.ap.ap.entity.Educacion;
import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> findAllEducaciones() {
        return educacionRepo.findAll();
    }

    public Educacion updateEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void deleteEducacion(Long id) {
        educacionRepo.deleteEducacionById(id);
    }

    public Educacion findEducacionById(Long id) {
        return educacionRepo.findEducacionById(id).orElseThrow(() -> new UserNotFoundException("El estudio de id" + id + "no fue encontrado"));

    }
}