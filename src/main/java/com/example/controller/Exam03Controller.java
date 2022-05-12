package com.example.controller;

import java.text.NumberFormat;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	
	@RequestMapping("/calc")
	public String calc(int num1, int num2,int num3) {

	   
		 NumberFormat nfNum = NumberFormat.getNumberInstance(); 
		
		application.setAttribute("price1",nfNum.format(num1 + num2 + num3));
		
		application.setAttribute("price2",nfNum.format((int) ((num1 + num2 + num3)*1.1)));

		return "exam03-result";
	
	}	
}
