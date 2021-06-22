package com.example.demo.rest_template;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CheckResultTemplate {

	private boolean ok;

	private Map<String, List<String>> errorMessages;

	public CheckResultTemplate() {
	}
}
