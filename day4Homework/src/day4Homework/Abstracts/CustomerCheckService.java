package day4Homework.Abstracts;

import day4Homework.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
