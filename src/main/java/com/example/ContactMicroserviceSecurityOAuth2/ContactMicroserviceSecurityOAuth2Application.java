package com.example.ContactMicroserviceSecurityOAuth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class ContactMicroserviceSecurityOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(ContactMicroserviceSecurityOAuth2Application.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
