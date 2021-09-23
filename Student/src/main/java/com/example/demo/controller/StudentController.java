package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	
	@Autowired
	private StudentService service;
	
	@PostMapping
	public Student saveStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudent()
	{
		return service.getAllSudents();
	}
	@PutMapping
	public Student upadateStudent(Student student)
	{
		return service.updateStudent(student);
	}

	@DeleteMapping
	public void deleteStudent(Student student)
	{
		service.deleteStudent(student);
	}
}
