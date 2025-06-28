package com.student.Student_Demo.controller;
import java.util.*;
import com.student.Student_Demo.repository.StudentRepo;
import com.student.Student_Demo.model.StudentDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class StudentRecordsHandler {

    StudentDetails studentDetails;

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/students")
    public List<StudentDetails> getAllStudentDetails() {
        List<StudentDetails> studentList = studentRepo.findAll();
         return studentList;
    }

    @GetMapping("/students/{roll}")
    public StudentDetails getStudentDetailsByRoll(@PathVariable int roll) {
        StudentDetails student = studentRepo.findById(roll).get();
        return student; // Return null if not found
    }


    @PostMapping("/students/add")
    public void createStudentDetails(@RequestBody StudentDetails studentDetails) {
        studentRepo.save(studentDetails);
        System.out.println("Student details added successfully: " + studentDetails.getName());
    }
    

    @PutMapping("/students/update/{roll}")
    public void updateStudentDetails(@PathVariable int roll, @RequestBody StudentDetails studentDetails) {
    
        StudentDetails existingStudent = studentRepo.findById(roll).get();
            StudentDetails updatedStudent = existingStudent;
            updatedStudent.setName(studentDetails.getName());
            updatedStudent.setAge(studentDetails.getAge());
            updatedStudent.setEmail(studentDetails.getEmail());
            updatedStudent.setPhone(studentDetails.getPhone());
            studentRepo.save(updatedStudent);
    }
    
    @DeleteMapping("students/delete/{roll}")
    public void deleteStudentDetails(@PathVariable int roll) {
        StudentDetails student = studentRepo.findById(roll).get();
        studentRepo.delete(student);
    }
}
