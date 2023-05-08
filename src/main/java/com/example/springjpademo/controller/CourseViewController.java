package com.example.springjpademo.controller;

import com.example.springjpademo.repository.CourseMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseViewController {
    @Autowired
    CourseMongoRepository courseMongoRepository;
 @GetMapping("/home")
    public String getHome(){
     return "home";
 }

    @GetMapping("/courses")
    public String getCourses(Model model){
     model.addAttribute(courseMongoRepository.findAll());
        return "courses";
    }
}
