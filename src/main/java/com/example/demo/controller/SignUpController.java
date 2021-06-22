package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign-up")
public class SignUpController {

	@GetMapping
	public String showSignUpPage() {
		return "signup";
	}

	@PostMapping
	public String submitSignUp() {

		boolean isOk = false;
		if (isOk) {
			return "signup";
		}
		return "signup";

	}
}
