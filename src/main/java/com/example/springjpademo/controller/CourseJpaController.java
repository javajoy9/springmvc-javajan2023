package com.example.springjpademo.controller;

import com.example.springjpademo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
/*
@RestController
@RequestMapping("/jpa")
public class CourseJpaController {

    @Autowired
    CourseJpaRepository courseJpaRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseJpaRepository.findAll();
    }
    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable  int id){
        return this.courseJpaRepository.getReferenceById(id);
    }

    @PostMapping("/courses")
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        this.courseJpaRepository.save(course);
        return ResponseEntity.created(null).body(course);
    }

    @DeleteMapping("/courses/{id}")
    public ResponseEntity<Course> removeCourse(@PathVariable  int id){

        Optional<Course> optionalCourse = this.courseJpaRepository.findById(id);
        if(optionalCourse.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Course course = optionalCourse.get();
    this.courseJpaRepository.delete(course);
        return ResponseEntity.created(null).body(course);
    }

    @PutMapping("/courses")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course){

        Optional<Course> optionalCourse = this.courseJpaRepository.findById(course.getId());
        if(optionalCourse.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Course newCourse = optionalCourse.get();
        newCourse.setName(course.getName());
        newCourse.setInstructor(course.getInstructor());
        newCourse.setDuration(course.getDuration());
        this.courseJpaRepository.save(newCourse);
        return ResponseEntity.created(null).body(course);
    }
    @PatchMapping("/courses")
    public ResponseEntity<Course> partiallyUpdateCourse(@RequestBody Course course){

        Optional<Course> optionalCourse = this.courseJpaRepository.findById(course.getId());
        if(optionalCourse.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Course newCourse = optionalCourse.get();
        if(course.getName()!=null)
        newCourse.setName(course.getName());
        if(course.getInstructor()!=null)
        newCourse.setInstructor(course.getInstructor());
        if(course.getDuration()!=0)
        newCourse.setDuration(course.getDuration());

        this.courseJpaRepository.save(newCourse);
        return ResponseEntity.created(null).body(newCourse);
    }

}*/
