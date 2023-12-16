package com.library.management.system.data.repository;

import com.library.management.system.data.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookOrderRepository extends JpaRepository<Book, Integer> {
}
