package com.threedtrader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threedtrader.model.Customer;
import com.threedtrader.repository.CustomerRepository;
import com.threedtrader.repository.HibernateCustomerRepositoryImpl;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepostory) {
		System.out.println("you are using constructor injection");
		this.customerRepository = customerRepository;
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("you are using setter injection");

		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.threedtrader.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
