package com.cart.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cart.entities.Book;

@FeignClient(name = "BOOKSERVICE", url = "http://localhost:8081/")
public interface BookServiceExternal {
	
	@GetMapping("/book-service/get-book/{bookId}")
	Book getBook(@PathVariable Integer bookId);

}
