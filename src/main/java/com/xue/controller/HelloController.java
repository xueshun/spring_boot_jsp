package com.xue.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	 
	@Value("${application.hello:Hello Angel}")
	 private String hello;
	
	@RequestMapping("/helloJsp")
	public String index(Model model){
		  System.out.println("HelloController.helloJsp().hello="+hello);
		  model.addAttribute("hello", hello);
          return "helloJsp";
	}
}