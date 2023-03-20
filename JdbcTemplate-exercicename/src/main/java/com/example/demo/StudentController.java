package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentController {
	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping("/")
	public String showStudentForm(Student student) {
		return "form";
	}
	
	@PostMapping("/student")
	public String saveStudent(@Valid Student student, Errors errors) {
		if (errors.hasErrors()) {
			return "form";
		}
		
	studentRepo.save(student);
		return "redirect:/student/list";
	}
	
	/**@GetMapping("/student/list")
	public String showStudents(Model model) {
		model.addAttribute("students", studentRepo.findAll());
		return "studentpage";
	}**/
	
	/**@GetMapping("/student/email")
	public String showEmail(Model model, String email) {
		model.addAttribute("students", studentRepo.findOne(email));
		return "studentpage";
	}**/
	
	@GetMapping("/student/name")
	public String showEmail(Model model, String name) {
		model.addAttribute("students", studentRepo.findOne(name));
		return "studentpage";
	}

}