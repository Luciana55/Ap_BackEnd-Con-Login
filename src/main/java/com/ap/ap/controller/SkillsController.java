package com.ap.ap.controller;

import com.ap.ap.entity.Skills;
import com.ap.ap.service.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
@CrossOrigin(origins = "https://luciana-ap.web.app")
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> getAllSkills() {
        List<Skills> skills = skillsService.findAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Skills> getSkillsById(@PathVariable("id") Long id) {
        Skills skills = skillsService.findSkillsById(id);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Skills> addSkills(@RequestBody Skills skills){
        Skills newSkills= skillsService.addSkills(skills);
        return new ResponseEntity<>(newSkills, HttpStatus.CREATED);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Skills> updateSkills(@RequestBody Skills skills) {
        Skills updateSkills = skillsService.updateSkills(skills);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkills(@PathVariable("id") Long id) {
        skillsService.deleteSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
