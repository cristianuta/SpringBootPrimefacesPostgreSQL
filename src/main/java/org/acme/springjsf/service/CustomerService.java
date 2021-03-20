package org.acme.springjsf.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;
import javax.inject.Named;

import org.acme.springjsf.model.Customer;
import org.acme.springjsf.repository.CustomerRepository;

@Named
public class CustomerService {

	@Inject
	private CustomerRepository repository;
	
	private AtomicInteger counter = new AtomicInteger();

	public void createCustomer() {
		Customer customer = new Customer("John " + counter.get(), "Doe " + counter.getAndIncrement());
		repository.save(customer);
	}

	public List<Customer> allCustomers() {
		List<Customer> customers = repository.findAll();
		return customers;
	}
}
