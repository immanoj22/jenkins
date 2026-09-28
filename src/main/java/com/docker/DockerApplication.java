package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		System.out.println("Java TimeZone = " + TimeZone.getDefault().getID());
		SpringApplication.run(DockerApplication.class, args);
	}

}
