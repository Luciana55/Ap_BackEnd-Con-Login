package com.ap.ap.repository;

import com.ap.ap.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long> {

    void deletePersonaById(Long id);

    Optional<Persona> findPersonaById(Long id);
}
