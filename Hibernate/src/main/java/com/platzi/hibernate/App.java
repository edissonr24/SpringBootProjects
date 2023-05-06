package com.platzi.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.hibernate.dao.TeacherDaoImpl;
import com.platzi.hibernate.model.Course;
import com.platzi.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        /*SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();*/
        
//        Teacher teacher = new Teacher("Anahi Ruiz", "Avatar");
//        Course course = new Course("Java Avanzado", "Tema 1", "Rest Api");
//        
//        session.beginTransaction();
//        session.save(course);
//        session.getTransaction().commit();
        
        Teacher teacher = new Teacher("Andres", "Avatar");
        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
        teacherDaoImpl.saveTeacher(teacher);
        
        List<Teacher> teachers = teacherDaoImpl.findAllTeachers();
        for(Teacher t : teachers) {
        	System.out.println("Nombre: " + t.getName());
        }
                
    }
}
