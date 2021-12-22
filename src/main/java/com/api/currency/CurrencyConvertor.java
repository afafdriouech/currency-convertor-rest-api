package com.api.currency;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
//@RestController
public class CurrencyConvertor {
	
	
	private static final Logger log = LoggerFactory.getLogger(CurrencyConvertor.class);
	private static final String accessKey="178bd3ec1a0ebed7404598d8faffd694";

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertor.class, args);
	}
	
	/*@GetMapping("/helloPage")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}*/
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Convertor rates = restTemplate.getForObject(
					"http://api.exchangeratesapi.io/v1/latest?access_key="+CurrencyConvertor.accessKey+"&format=1", Convertor.class);
			log.info(rates.toString());
		};
	}

}
