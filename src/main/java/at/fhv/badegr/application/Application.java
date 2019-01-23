package at.fhv.badegr.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	/**
	* Main entry point to start the spring boot application
	* @param args The command line arguments
	*/
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

}
