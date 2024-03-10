package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.st.bean.EmployeeDetails;

@SpringBootApplication
public class BootProject02Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProject02Application.class, args);
		EmployeeDetails emp = ctx.getBean("EmpClass", EmployeeDetails.class);
		System.out.println(emp);
	}

}
