package com.example.schoolapigroupone.repository;

import com.example.schoolapigroupone.model.Groups;
import com.example.schoolapigroupone.model.Students;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class List extends DBConnect implements StudentRepository{

    @Override
    public java.util.List<Students> findAll() {
        List<Students> results = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Students");
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            Groups group_id = resultSet.getInt("group_id");

//            print result
            System.out.println(id + " | " + name + " | " + name + " | " + group_id);
        }
        return (java.util.List<Students>) results;
    }

    @Override
    public Students add(Students s) {
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO Students(name,group_id) VALUES(" + name + "," + group_id + ")");
        return s;
    }

    @Override
    public void deleteById(Long id)  {
        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from Students where id =" + id);
        return;
    }

    @Override
    public Students updateNameId(Long id, String newName) {
        List<Students> results = new ArrayList<>();
        Statement statement = connection.createStatement();
        statement.executeUpdate("UPDATE Students SET name=" + newName +" WHERE id = " + id);
        return results;
    }

    @Override
    public String findWhereNameLike(String query) {
        Statement statement = connection.createStatement();
        statement.executeUpdate("SELECT * from Students WHERE name like (%" + name+ "%");
        return query;
    }
}
