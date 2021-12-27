package com.api.currency.controller;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.currency.exception.CurrencyNotFound;
import com.api.currency.model.Convertor;
import com.api.currency.model.Query;
import com.api.currency.model.ResultBody;

@RestController
@Validated
public class ConversionController {

	private String accessKey="178bd3ec1a0ebed7404598d8faffd694";
	
	@GetMapping("/convert")
	public ResultBody convert(@Valid @NotBlank @RequestParam(value = "sourceCurrency") String source, 
			@Valid @NotNull @RequestParam(value = "amount") Double amount,
			@Valid @NotBlank @RequestParam(value = "targetCurrency") String target) throws CurrencyNotFound{
		Double srcRate= conversionRates(source);
		Double targetRate= conversionRates(target);
		if (srcRate == null || targetRate == null)
			throw new CurrencyNotFound("currency not found");
		Double srcToTargetRate=targetRate/srcRate;
	//return srcToTargetRate*amount;
		Query query= new Query(source,target,amount);
		return new ResultBody(true,query,srcToTargetRate*amount);
	}
	
	public Double conversionRates(String currency)
	{
		String uri="http://api.exchangeratesapi.io/v1/latest?access_key="+accessKey+"&format=1";
		RestTemplate restTemplate= new RestTemplate();
		Convertor rates = restTemplate.getForObject(uri,Convertor.class);
		return rates.getRate(currency);
	}
	
}
