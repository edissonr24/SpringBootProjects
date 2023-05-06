package com.platzi.platziteachers.service;

import java.util.List;

import com.platzi.platziteachers.model.Course;

public interface CourseService {
	
	void save(Course course);
	
	List<Course> findAllCourses();
	
	void deleteCourseById(Long courseId);
	
	void updateCourse(Course course);	
	
	Course findById(Long idCourse);
	
	Course findByName(String name);
	
	List<Course> findByIdTeacher(Long idTeacher);
}
