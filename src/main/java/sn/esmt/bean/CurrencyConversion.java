package sn.esmt.bean;

import java.math.BigDecimal;

public class CurrencyConversion {
	private long id;
	private String from;
	private String to;
	private BigDecimal rateExchange;
	private BigDecimal amount;
	private BigDecimal calculateAmount;
	
	public CurrencyConversion() {}
	
	public CurrencyConversion(long id, String from, String to, BigDecimal rateExchange, BigDecimal amount, BigDecimal calculateAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.rateExchange = rateExchange;
		this.amount = amount;
		this.calculateAmount = calculateAmount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getRateExchange() {
		return rateExchange;
	}

	public void setRateExchange(BigDecimal rateExchange) {
		this.rateExchange = rateExchange;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCalculateAmount() {
		return calculateAmount;
	}

	public void setCalculateAmount(BigDecimal calculateAmount) {
		this.calculateAmount = calculateAmount;
	}
	
	

}
