package com.example.mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mysql.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
//public List<Book> findBybookName(String name);

public List<Book> findBybookName(String bookName);



}
