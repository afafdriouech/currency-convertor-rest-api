package com.api.currency;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

	@GetMapping("/convert")
	public ResultBody convert(@RequestParam(value = "sourceCurrency", defaultValue = "World") String source, 
			@RequestParam(value = "amount", defaultValue = "World") Double amount,
			@RequestParam(value = "targetCurrency", defaultValue = "World") String target) {
	return new ResultBody(true,new Query(source,target,amount),123.4);
	}
}
