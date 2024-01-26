package com.callor.hello.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.hello.models.StudentDto;
import com.callor.hello.service.StudentService;


@Controller
public class HomeController {

	/*Spting profect 에서 가장 많이 보이는 에러 메세지
	 * no qualifying bean of type "com.callor.hello.service.StudentService"
	 * 
	 * HomeContraller 에서 StudentService 클래스로 만들어진 bean (객체,컴포넌트)
	 * 를 사용하겠다고 Spring 에게 달라 라고 요청을 해ㄸ다.
	 * 
	 * 그런데 어떤 이유로 StudentService 클래스의 bean 이 생성이 안되었을때
	 * 보여지는 에러메세지이다. 
	 * 
	 * 이 메세지의 대부분의 원인은 bean 를 생성할 클래스에 Annotation 이 누락된경우이다.*/
	
	private final StudentService studentService;

	public HomeController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		StudentDto stDto = studentService.getStudent();
		
		return "home";
	}

}
