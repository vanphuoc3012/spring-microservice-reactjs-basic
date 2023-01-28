package com.sha.springbootmicroservice1course.service;

import com.sha.springbootmicroservice1course.model.Course;
import com.sha.springbootmicroservice1course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepo;

    @Override
    public Course saveCourse(Course course) {
        course.setCreatedTime(LocalDateTime.now());
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRepo.deleteById(courseId);
    }

    @Override
    public List<Course> findAllCourse() {
        return courseRepo.findAll();
    }
}
