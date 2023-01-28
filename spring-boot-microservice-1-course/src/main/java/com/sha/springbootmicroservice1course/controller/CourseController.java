package com.sha.springbootmicroservice1course.controller;

import com.sha.springbootmicroservice1course.model.Course;
import com.sha.springbootmicroservice1course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<?> saveCourse(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.saveCourse(course).getId(), CREATED);
    }

    @DeleteMapping("{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable(name = "courseId") Long courseId) {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllCourses() {
        return new ResponseEntity<>(courseService.findAllCourse(), OK);
    }

}
