//package com.example.coursesapi.services;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class CourceInstanceService {
//
//}
package com.example.coursesapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coursesapi.model.CourseInstance;
import com.example.coursesapi.repository.CourseInstanceRepository;

import jakarta.transaction.Transactional;

@Service
public class CourseInstanceService {

	@Autowired
	private CourseInstanceRepository courseInstanceRepository;

	public CourseInstance createCourseInstance(CourseInstance courseInstance) {
		return courseInstanceRepository.save(courseInstance);
	}

	public List<CourseInstance> getCoursesByYearAndSemester(int year, int semester) {
		return courseInstanceRepository.findByYearAndSemester(year, semester);
	}

//	public CourseInstance getCourseInstanceDetails(int year, int semester, Long courseId) {
//
//		return this.courseInstanceRepository.findByYearAndSemesterAndCourseId(year, semester, courseId);
//	}
	public CourseInstance getCourseInstanceDetails(int year, int semester, Long courseId) {
	    CourseInstance courseInstance = this.courseInstanceRepository.findByYearAndSemesterAndCourseId(year, semester, courseId);
	    
	    if (courseInstance == null) {
	        System.out.println("No course instance found for year: " + year + ", semester: " + semester + ", courseId: " + courseId);
	    } else {
	        System.out.println("Course instance found: " + courseInstance);
	    }
	    
	    return courseInstance;
	}
	@Transactional
	 public boolean deleteCourseInstance(int year, int semester, Long courseId) {
	        courseInstanceRepository.deleteByYearAndSemesterAndCourseId(year, semester, courseId);
			return false;
	    }
}