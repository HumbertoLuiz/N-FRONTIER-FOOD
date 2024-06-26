package com.br.nofrontier.food.domain.filter;

import java.time.OffsetDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DailySalesFilter {

	private Long restaurantId;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private OffsetDateTime initialCreationDate;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private OffsetDateTime exitCreationDate;
	
}
