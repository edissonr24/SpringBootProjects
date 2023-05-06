package com.platzi.platziteachers.dao;

import java.util.List;

import com.platzi.platziteachers.model.Teacher;


public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	void deleteTeacherById(Long idTeacher);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);

}
