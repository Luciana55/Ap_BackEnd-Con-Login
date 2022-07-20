package com.ap.ap.repository;

import com.ap.ap.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long> {

    void deleteExperienciaById(Long id);

    Optional<Experiencia> findExperienciaById(Long id);
}

