package com.izeye.helloworld.firebaseadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * Hello world for Firebase Admin Java SDK.
 *
 * @author Johnny Lim
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class HelloFirebaseAdminJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloFirebaseAdminJavaApplication.class, args);
	}

}
