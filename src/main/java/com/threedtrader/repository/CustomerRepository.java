package com.threedtrader.repository;

import java.util.List;

import com.threedtrader.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}