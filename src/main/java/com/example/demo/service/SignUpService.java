package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.rest_template.CheckResultTemplate;
import com.example.demo.rest_template.SignUpTemplate;

@Service
public class SignUpService {

	@Autowired
    RestTemplate restTemplate;

	/** 郵便番号検索API リクエストURL */
    private static final String URL = "http://localhost:8082/sign-up";

	// RestTemplateをコンストラクタインジェクションする
    public SignUpTemplate getSignUpTemplate() {
        return restTemplate.getForObject(URL, SignUpTemplate.class);
    }

    public CheckResultTemplate signUp(SignUpTemplate signUpTemplate) {
    	return restTemplate.postForObject(URL, signUpTemplate, CheckResultTemplate.class);
    }
}
