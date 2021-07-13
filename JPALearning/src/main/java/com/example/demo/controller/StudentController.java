package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.Student;

@Controller
public class StudentController {
	@Autowired
	StudentDAO studdao;
	@RequestMapping("home")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("addStud")
	public String addStudent(Student stud)
	{
		studdao.save(stud);
		return "home.jsp";
	}
	@RequestMapping("getStud")
	public ModelAndView getStudent(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("showStudent.jsp");
		Student student=studdao.findById(id).orElse(new Student());
		mav.addObject(student);
		return mav;
	}
	@RequestMapping("delStud")
	public ModelAndView delStudent(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("deleteStudent.jsp");
		Student student=studdao.findById(id).orElse(new Student());
		studdao.deleteById(id);
		mav.addObject(student);
		return mav;
	}
	@RequestMapping("updateStud")
	public ModelAndView updateStudent(Student student)
	{
		ModelAndView mav=new ModelAndView("updateStudent.jsp");
		student=studdao.findById(student.getId()).orElse(new Student());
		studdao.deleteById(student.getId());
		mav.addObject(student);
		return mav;
	}
}
