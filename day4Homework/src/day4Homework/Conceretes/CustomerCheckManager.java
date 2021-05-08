package day4Homework.Conceretes;

import day4Homework.Abstracts.CustomerCheckService;
import day4Homework.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}

	

}
