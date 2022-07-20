package com.ap.ap.service;

import com.ap.ap.entity.Skills;
import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkills(Skills skills) {
        return skillsRepo.save(skills);
    }

    public List<Skills> findAllSkills() {
        return skillsRepo.findAll();
    }

    public Skills updateSkills(Skills skills) {
        return skillsRepo.save(skills);
    }

    public void deleteSkills(Long id) {
        skillsRepo.deleteSkillsById(id);
    }

    public Skills findSkillsById(Long id) {
        return skillsRepo.findSkillsById(id).orElseThrow(() -> new UserNotFoundException("Skill de id" + id + "no fue encontrado"));

    }
}
