package com.br.nofrontier.food.domain.exception;

public class KitchenNotFoundException extends EntityNotFoundException {

	private static final long serialVersionUID = 1L;

	public KitchenNotFoundException(String message) {
		super(message);
	}
	
	public KitchenNotFoundException(Long kitchenId) {
		this(String.format("There is no kitchen register with a code %d", kitchenId));
	}

}
