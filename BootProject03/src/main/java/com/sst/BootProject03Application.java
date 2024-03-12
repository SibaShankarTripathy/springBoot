package com.sst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sst.store.GeneralStore;

@SpringBootApplication
public class BootProject03Application {

	public static void main(String[] args) {
		//Getting Container
		ApplicationContext ctx = SpringApplication.run(BootProject03Application.class, args);
		//Get bean object of class
		GeneralStore generalStore = ctx.getBean("generalStore",GeneralStore.class);
		System.out.println(generalStore);
	}

}
