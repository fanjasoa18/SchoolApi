package com.example.schoolapigroupone.repository;

import com.example.schoolapigroupone.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students,Long> {

}
