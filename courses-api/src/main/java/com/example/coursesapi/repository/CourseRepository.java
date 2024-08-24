//package com.example.coursesapi.model.repository;
//
//public interface CourseRepository {
//
//}
package com.example.coursesapi.repository;

import com.example.coursesapi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // No additional methods are required; JpaRepository provides all basic CRUD operations.
}