package com.hnm.research.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

		@RequestMapping("/home")
		public String home() {
			return "Hello, Spring boot!";
		}
}