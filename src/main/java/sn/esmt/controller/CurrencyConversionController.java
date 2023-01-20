package sn.esmt.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import sn.esmt.bean.CurrencyConversion;
import sn.esmt.proxy.CurrencyExchangeProxy;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy proxy;

	@GetMapping("/currency-conversion/from/{from}/to/{to}/amount/{amount}")
	CurrencyConversion getCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal amount) {
		
//		HashMap<String, String> uriVariables = new HashMap<>();
//		uriVariables.put("from", from);
//		uriVariables.put("to", to);
//		
//		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().
//				getForEntity("http://localhost:8034/currency-exchange/from/{from}/to/{to}",
//				CurrencyConversion.class, uriVariables);
		
		CurrencyConversion currencyConversion = proxy.getCurrencyExchange(from, to);
		
//		CurrencyConversion currencyConversion = responseEntity.getBody();
		
		return new CurrencyConversion(currencyConversion.getId(),
				from, to, amount, currencyConversion.getRateExchange(),
				amount.multiply(currencyConversion.getRateExchange()));
	}
}
