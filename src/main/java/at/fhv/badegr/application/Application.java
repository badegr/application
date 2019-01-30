package at.fhv.badegr.application;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// import at.fhv.badegr.application.handlers.SearchHandler;
// import at.fhv.badegr.application.models.SearchResult;

@SpringBootApplication
public class Application {

	// private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/**
	 * Main entry point to start the spring boot application
	 * 
	 * @param args The command line arguments
	 */
	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * isolated debug environment
	 * 
	 * @param restTemplate
	 * @return
	 * @throws Exception
	 */
	// @Bean
	// public CommandLineRunner run(SearchHandler handler) throws Exception {
	// 	return args -> {
	// 		SearchResult result = handler.search("burrito", "");
	// 		log.debug(result.url);
	// 	};
	// }
}
