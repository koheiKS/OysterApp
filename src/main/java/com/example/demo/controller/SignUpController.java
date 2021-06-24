package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.rest_template.CheckResultTemplate;
import com.example.demo.rest_template.SignUpTemplate;
import com.example.demo.service.SignUpService;

@Controller
@RequestMapping("/sign-up")
public class SignUpController {

	@Autowired
	SignUpService signUpService;

	@GetMapping
	public String showSignUpPage(Model model) {
		SignUpTemplate signUpTemplate = signUpService.getSignUpTemplate();
		model.addAttribute("signUpTemplate", signUpTemplate);
		return "signup";
	}

	@PostMapping
	public String submitSignUp(@ModelAttribute SignUpTemplate signUpTemplate, Model model) {

		CheckResultTemplate checkResultTemplate = signUpService.signUp(signUpTemplate);

		return "signup";
	}
}
