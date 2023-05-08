package com.example.springjpademo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document(collection = "coursecollection")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    int id;
    String name;
    String instructor;
    int duration;
}
