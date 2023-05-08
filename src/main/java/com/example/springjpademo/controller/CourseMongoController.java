package com.example.springjpademo.controller;

import com.example.springjpademo.model.Course;
import com.example.springjpademo.repository.CourseMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mongo")
public class CourseMongoController {
    @Autowired
    CourseMongoRepository courseMongoRepository;
    @GetMapping("/courses/{id}")
    public Course getById(@PathVariable int id){
        Optional<Course> optionalCourse = this.courseMongoRepository.findById(id);
        return  optionalCourse.get();
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return this.courseMongoRepository.findAll();
    }

    @DeleteMapping("/coursedel/{id}")
    public ResponseEntity<Course> removeCourse(@PathVariable  int id){

        Optional<Course> optionalCourse = this.courseMongoRepository.findById(id);
        if(optionalCourse.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Course course = optionalCourse.get();
        this.courseMongoRepository.delete(course);
        return ResponseEntity.created(null).body(course);
    }
}
