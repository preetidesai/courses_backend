package com.example.coursesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.coursesapi.model.Course;
import com.example.coursesapi.services.CourceService;

@RestController
public class CourceController {
	@Autowired
	private CourceService courseService;

	@PostMapping("api/courses")
	public Course createCources(@RequestBody Course course) {
		return this.courseService.createCource(course);
	}

	@GetMapping("api/courses")
	public List<Course> getAllCources() {
		return this.courseService.getAllCources();
	}

	@GetMapping("api/courses/{id}")
	public Course getCourseById(@PathVariable long id) {
		return this.courseService.getCourseById(id);
	}

	@DeleteMapping("api/courses/{id}")
	public String deleteCourseById(@PathVariable long id) {
		return this.courseService.deleteCourseById(id);
	}
	

}
