package com.my_testing.MyTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyTestingApplication {
	public static String concatString(String st1,String st2){
		return st1.concat(st2);
	}
	public static void main(String[] args) {
		SpringApplication.run(MyTestingApplication.class, args);

		System.out.println(MyTestingApplication.concatString("Pushkar","Bisht"));

	}

}
