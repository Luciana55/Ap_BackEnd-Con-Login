package com.ap.ap.repository;

import com.ap.ap.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillsRepo extends JpaRepository<Skills, Long> {

    void deleteSkillsById(Long id);

    Optional<Skills> findSkillsById(Long id);
}

