package com.br.nofrontier.food.domain.exception;

public class RestaurantNotFoundException extends EntityNotFoundException {

	private static final long serialVersionUID = 1L;

	public RestaurantNotFoundException(String message) {
		super(message);
	}

	public RestaurantNotFoundException(Long restaurantId) {
		this(String.format("There is no restaurant register with a code %d", restaurantId));
	}

}
