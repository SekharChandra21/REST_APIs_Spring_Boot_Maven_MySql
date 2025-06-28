package com.student.Student_Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.student.Student_Demo.model.StudentDetails;

public interface StudentRepo extends JpaRepository<StudentDetails, Integer>, CrudRepository<StudentDetails, Integer> {
    // This interface will automatically provide CRUD operations for StudentDetails
    // No need to define methods unless custom queries are required
}
