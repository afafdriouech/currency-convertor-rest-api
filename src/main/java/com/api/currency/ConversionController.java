package com.api.currency;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConversionController {

	private String accessKey="178bd3ec1a0ebed7404598d8faffd694";
	
	/*@GetMapping("/convert")
	public ResultBody convert(@RequestParam(value = "sourceCurrency", defaultValue = "World") String source, 
			@RequestParam(value = "amount", defaultValue = "World") Double amount,
			@RequestParam(value = "targetCurrency", defaultValue = "World") String target) {
	return new ResultBody(true,new Query(source,target,amount),123.4);
	}*/
	
	@GetMapping("/convert")
	public Double convert(@RequestParam(value = "sourceCurrency") String source, 
			@RequestParam(value = "amount", defaultValue = "World") Double amount,
			@RequestParam(value = "targetCurrency", defaultValue = "World") String target) {
	return conversionRates(source);
	}
	
	public Double conversionRates(String currency)
	{
		String uri="http://api.exchangeratesapi.io/v1/latest?access_key="+accessKey+"&format=1";
		RestTemplate restTemplate= new RestTemplate();
		Convertor rates = restTemplate.getForObject(uri,Convertor.class);
		return rates.getRate(currency);
	}
	
}
