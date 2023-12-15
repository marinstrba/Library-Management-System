package com.library.management.system.data.repository;

import com.library.management.system.data.entity.CheckOut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckOutRepository extends JpaRepository<CheckOut, Integer> {
}
