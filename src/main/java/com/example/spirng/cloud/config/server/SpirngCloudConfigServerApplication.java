package com.example.spirng.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.*;

@EnableConfigServer
@SpringBootApplication
public class SpirngCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpirngCloudConfigServerApplication.class, args);
	}

}
