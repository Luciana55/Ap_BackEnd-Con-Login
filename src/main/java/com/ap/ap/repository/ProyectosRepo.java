package com.ap.ap.repository;

import com.ap.ap.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProyectosRepo extends JpaRepository<Proyectos, Long> {

    void deleteProyectosById(Long id);

    Optional<Proyectos> findProyectosById(Long id);
}
