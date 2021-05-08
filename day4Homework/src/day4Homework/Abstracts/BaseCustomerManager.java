package day4Homework.Abstracts;

import day4Homework.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("veri tabanina kaydedildi: "+ customer.getFirstName());
	}

}

