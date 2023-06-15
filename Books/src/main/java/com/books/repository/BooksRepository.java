package com.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.entities.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>{

}
