//package com.example.coursesapi.model;
//
//public class courceInstance {
//
//}
package com.example.coursesapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CourseInstance {

    public CourseInstance( int year, int semester, Course course) {
		super();
//		this.id = id;
		this.year = year;
		this.semester = semester;
		this.course = course;
	}
	public CourseInstance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private int semester;

    @ManyToOne
    private Course course;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }
}
