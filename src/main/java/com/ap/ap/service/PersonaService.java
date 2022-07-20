package com.ap.ap.service;

import com.ap.ap.entity.Persona;
import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaService {
    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public Persona addPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public List<Persona> findAllPersonas(){
        return personaRepo.findAll();
    }

    public Persona updatePersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public Persona findPersonaById(Long id) {
        return personaRepo.findPersonaById(id).orElseThrow(() -> new UserNotFoundException("El usuario de id" + id + "no fue encontrado"));
    }

    public void deletePersona(Long id){

        personaRepo.deletePersonaById(id);
    }
}