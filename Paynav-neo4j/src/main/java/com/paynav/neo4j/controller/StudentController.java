package com.paynav.neo4j.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paynav.neo4j.node.Student;
import com.paynav.neo4j.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		Student stu = studentRepository.save(student);
		return stu;
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}
	
	@PatchMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		Student stud = studentRepository.findById(student.getId()).get();
		stud.setId(student.getId());
		stud.setName(student.getName());
		Student saved = studentRepository.save(stud);
		return saved;
	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteById(@PathVariable("id") int id) {
		studentRepository.deleteById(id);
		return "Student Deleted by : "+id;
	}

}
