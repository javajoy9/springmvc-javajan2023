package com.example.springjpademo.repository;

import com.example.springjpademo.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseMongoRepository extends MongoRepository<Course, Integer> {
}
