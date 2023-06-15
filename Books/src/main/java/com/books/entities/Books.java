package com.books.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

	@Id
	private Integer bookId;
	private String bookTitle;
	private String bookAuthor;
	private Integer bookPrice;
	private Integer bookQuantity;
	private String bookLastPurchase;
	private Integer bookTotalSales;
}
