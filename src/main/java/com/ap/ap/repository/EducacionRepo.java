package com.ap.ap.repository;

import com.ap.ap.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long> {

    void deleteEducacionById(Long id);

    Optional<Educacion> findEducacionById(Long id);
}

