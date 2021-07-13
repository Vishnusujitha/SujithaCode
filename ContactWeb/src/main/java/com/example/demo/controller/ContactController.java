package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ConatctDAO;
import com.example.demo.model.Contact;

@Controller
public class ContactController {
	@Autowired
	ConatctDAO contactdao;
	
	@RequestMapping("homecontact")
	public String home() {
		return "homecontact.jsp";
	}
	
	@RequestMapping("addContact")
	public String addContact(Contact cont) {
		contactdao.save(cont);
		return "homecontact.jsp";
	}
	@RequestMapping("getContact")
	public ModelAndView getContact(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("getContact.jsp");
		Contact contact=contactdao.findById(id).orElse(new Contact());
	    mav.addObject(contact);
		return mav;
	}
	@RequestMapping("delContact")
	public ModelAndView deleteContact(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("deleteContact.jsp");
		Contact contact=contactdao.findById(id).orElse(new Contact());
		contactdao.deleteById(id);
	    mav.addObject(contact);
 		return mav;
	}
	@RequestMapping("updateContact")
	public ModelAndView updateContact(Contact contact) {
		ModelAndView mav=new ModelAndView("updateContact.jsp");
		contact=contactdao.findById(contact.getId()).orElse(new Contact());
		contactdao.deleteById(contact.getId());
	    mav.addObject(contact);
 		return mav;
	}
	}
