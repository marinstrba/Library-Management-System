package com.library.management.system.service;

import com.library.management.system.data.entity.CheckOut;
import com.library.management.system.data.entity.User;
import com.library.management.system.data.repository.CheckOutRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CheckOutService {

    private final CheckOutRepository checkOutRepository;


}
