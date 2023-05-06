package com.platzi.platziteachers.service;

import java.util.List;

import com.platzi.platziteachers.model.Teacher;

public interface TeacherService {

	void saveTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	void deleteTeacherById(Long idTeacher);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);
}
