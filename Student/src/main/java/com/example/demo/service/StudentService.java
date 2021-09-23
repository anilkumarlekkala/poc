package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentRepo stdRepo;
	
	public Student saveStudent(Student student)
	{
		return stdRepo.save(student);
	}
	
	public List<Student> getAllSudents()
	{
		return stdRepo.findAll();
		
	}
	public void deleteStudent(Student student)
	{
		stdRepo.delete(student);
	}
	public Student updateStudent(Student student)
	{
		return stdRepo.save(student);
	}

}
