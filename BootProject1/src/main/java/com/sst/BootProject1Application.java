package com.sst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sst.beans.SoftDrink;

@SpringBootApplication
public class BootProject1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProject1Application.class, args);
		SoftDrink soft = ctx.getBean("softdrink",SoftDrink.class);
		System.out.println(soft);
		System.out.println("=====System Information=====");
		System.out.println(System.getProperties());
	}

}
