package com.example.schoolapigroupone.controller;

import com.example.schoolapigroupone.model.Students;
import com.example.schoolapigroupone.repository.StudentRepo;
import com.example.schoolapigroupone.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    private StudentRepo repository;

    @GetMapping("/")
    public List<Students> findAll(){
        return repository.findAll();
    }
}
