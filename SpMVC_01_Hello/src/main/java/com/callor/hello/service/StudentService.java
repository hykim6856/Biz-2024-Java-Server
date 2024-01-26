package com.callor.hello.service;

import org.springframework.stereotype.Service;

import com.callor.hello.models.StudentDto;

@Service
public class StudentService {

	
	public StudentDto getStudent() {
		/*
		 * Builder pattern Dto 객체를 생성하고 , setter() method 를 사용하여 studentDto stDto = new
		 * Student Dto() 각 속성(변수) 에 값을 세팅하는 기존의 코드를 사용하지 않고 stDto.setStNum("0001");
		 * 
		 * 
		 * 
		 * builde() method 를 통하여 객체를 생성하면서 변수의 이름을 method처럼 사용하여 값을세팅하는 코딩스타일
		 */

		StudentDto stDto = StudentDto.builder().stNum("00.1").stName("홍길동").stDept("정보통신").build();

		return stDto;
	}
}
