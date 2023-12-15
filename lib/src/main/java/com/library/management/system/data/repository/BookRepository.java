package com.library.management.system.data.repository;

import com.library.management.system.data.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.naming.Name;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
