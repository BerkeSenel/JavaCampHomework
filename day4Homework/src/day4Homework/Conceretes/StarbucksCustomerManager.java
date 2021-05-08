package day4Homework.Conceretes;

import day4Homework.Abstracts.BaseCustomerManager;
import day4Homework.Abstracts.CustomerCheckService;
import day4Homework.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer)  {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			System.out.println("veri tabanina kaydedildi: " + customer.getFirstName());
		}
		else {
			System.out.println("Hatali kayit");
		}
		
	}

	
}
	
