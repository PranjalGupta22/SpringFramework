package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	//basic data inserting technique
//        //obj of jdbctemplate
//    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//    	JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//    	
//    	//insert query
//    	String query = "insert into student(studId , studName , studCity) value(?,?,?)";
//    	
//    	int result = template.update(query,4,"Devansh","Nagpur");
//    	System.out.println(result);
    	
    	
    	//mostly used
//    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	StudentDao studentDao = context.getBean("studentDaoImpl",StudentDao.class);
    	
    	//INSERT QUERY
    	Student insertStudent = new Student();
    	insertStudent.setStudId(5);
    	insertStudent.setStudName("Pranjal");
    	insertStudent.setCity("Hyderabad");
//    	int result = studentDao.insert(insertStudent);
//    	System.out.println(result);
    	
    	//UPDATE QUERY
    	Student updateStudent = new Student();
    	updateStudent.setStudId(2);
    	updateStudent.setStudName("Ashutosh");
    	updateStudent.setCity("Delhi");
//    	int result = studentDao.update(updateStudent);
//    	System.out.println(result);
    	
    	//DELETE QUERY
//    	Student delStudent = new Student();
//    	delStudent.setStudId(1);
//    	int result = studentDao.delete(2);
//    	System.out.println(result);
    	
    	//SELECTING DATA BY ID, ONLY ONE DATA
//    	Student student = studentDao.selectById(3);
//    	System.out.println(student);
    	
    	//SELECT ALL
    	List<Student> allStudent = studentDao.selectAll();
    	for(Student student : allStudent) {
        	System.out.println(student);
    	}
    	
    }
}
