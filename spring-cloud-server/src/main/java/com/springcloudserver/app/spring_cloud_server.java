package com.springcloudserver.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class spring_cloud_server {

	public static void main(String[] args) {
		SpringApplication.run(spring_cloud_server.class, args);
	}

}
