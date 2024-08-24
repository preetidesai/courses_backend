package com.example.coursesapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coursesapi.model.Course;
import com.example.coursesapi.repository.CourseRepository;

@Service
public class CourceService {
	@Autowired
	private CourseRepository courceRepo;

	public Course createCource(Course course) {
		return this.courceRepo.save(course);
	}

	public List<Course> getAllCources() {
		return this.courceRepo.findAll();
	}

	public Course getCourseById(Long id) {
		return this.courceRepo.findById(id).get();
	}

	public String deleteCourseById(Long id) {
		this.courceRepo.deleteById(id);
		return "course deleted sucessfully";
	}

}
