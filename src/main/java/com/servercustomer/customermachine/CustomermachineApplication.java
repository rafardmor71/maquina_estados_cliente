package com.servercustomer.customermachine;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomermachineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomermachineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		RestTemplate restTemplateOpen = new RestTemplate();
		String templateOpen = "http://localhost:9000/open";
		ResponseEntity<String> responseOpen
		  = restTemplateOpen.getForEntity(templateOpen, String.class);
		Thread.sleep(5000);
		RestTemplate restTemplateClose = new RestTemplate();
		String templateClose = "http://localhost:9000/close";
		ResponseEntity<String> responseClose
		  = restTemplateClose.getForEntity(templateClose, String.class);
		Thread.sleep(5000);
		RestTemplate restTemplateHalfClose = new RestTemplate();
		String templateHalfClose = "http://localhost:9000/halfOpen";
		ResponseEntity<String> response
		  = restTemplateHalfClose.getForEntity(templateHalfClose, String.class);
		
		
	}

}
