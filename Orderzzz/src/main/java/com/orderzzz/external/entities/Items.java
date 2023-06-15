package com.orderzzz.external.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Items {

	private Integer itemId;
	private Integer bookId;
	private Integer quantity;
	private Integer bookPrice;
	private Cart cart;
}
