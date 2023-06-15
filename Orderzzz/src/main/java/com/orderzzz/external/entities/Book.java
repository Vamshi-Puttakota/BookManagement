package com.orderzzz.external.entities;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Book {
	
	private Integer bookId;
	private String bookTitle;
	private String bookAuthor;
	private Integer bookPrice;
	private Integer bookQuantity;
	private String bookLastPurchase;
	private Integer bookTotalSales;
}