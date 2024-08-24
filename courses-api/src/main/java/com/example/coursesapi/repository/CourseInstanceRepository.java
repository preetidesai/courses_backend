package com.example.coursesapi.repository;

import java.util.List;

//package com.example.coursesapi.repository;
//
//import com.example.coursesapi.model.CourseInstance;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {
//	List<CourseInstance> findByYearAndSemester(int year, int semester);
//  	CourseInstance findByYearAndSemesterAndCourseId(int year, int semester, Long courseId);
////	void deleteByYearAndSemesterAndCourseId(int year, int semester, Long courseId);
//	void deleteByYearAndSemesterAndCourseId(int year, int semester, Long courseId);
//}

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coursesapi.model.CourseInstance;

public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {
    CourseInstance findByYearAndSemesterAndCourseId(int year, int semester, Long courseId);
	List<CourseInstance> findByYearAndSemester(int year, int semester);
	void deleteByYearAndSemesterAndCourseId(int year, int semester, Long courseId);
}

