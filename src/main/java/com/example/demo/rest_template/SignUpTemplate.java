package com.example.demo.rest_template;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SignUpTemplate {

	private String name;

    private String email;

    private String password;

    private String confirmPassword;

    public SignUpTemplate() {
    }
}
