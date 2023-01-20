package sn.esmt.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import sn.esmt.bean.CurrencyConversion;

@FeignClient(name="currency-exchange", url="localhost:8034")
public interface CurrencyExchangeProxy {
	@GetMapping ("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion getCurrencyExchange(
		  @PathVariable String from, @PathVariable String to);
	

}
