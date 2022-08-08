package com.example.schoolapigroupone.repository;

import com.example.schoolapigroupone.model.Groups;
import com.example.schoolapigroupone.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface StudentRepository extends JpaRepository<Students, Long> {
    //Idatabase
     String url = "jdbc:postgresql://localhost:5432/Todo";
     String user = "postgres";
     String password = "post18";


    List<Students> findAll();

    Students add(Students s);

    void deleteById(Long id);

    Students updateNameId(Long id, String newName);

    String findWhereNameLike(String query);

    //DEVOIR: implementez cette interface avec une classe concrète avec JDBC
    //SUR GOOGLE: proposez une autre implémentation avec JPQL(Java Persistence Query Language()vous pouvez voir l'annotation)
}
