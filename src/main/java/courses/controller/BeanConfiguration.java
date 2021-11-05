package courses.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import courses.beans.Classes;
import courses.beans.Teacher;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Classes classes() {
		Classes bean = new Classes();
		bean.setClassName("Advanced C#");
		bean.setNumber("174");
		bean.setSubject("CIS");
		bean.setTerm("Fall 2021");
		return bean;
	}
	
	@Bean
	public Teacher teacher() {
		Teacher bean =  new Teacher("Ambroson, Nick", "ntambroson@dmacc.edu");
		return bean;
	}

}
