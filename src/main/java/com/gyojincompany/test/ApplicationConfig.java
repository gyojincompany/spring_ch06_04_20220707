package com.gyojincompany.test;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationCTX.xml")
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("운동");
		hobbys.add("노래");
		
		Student student = new Student("홍길동", 25, hobbys);
		student.setWeight(80);
		student.setHeight(180);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("달리기");
		hobbys.add("자전거");
		
		Student student = new Student("김유신", 12, hobbys);
		student.setWeight(60);
		student.setHeight(150);
		
		return student;
	}

}
