package day4Homework;


import java.util.Date;

import day4Homework.Abstracts.BaseCustomerManager;
import day4Homework.Adapter.MernisServiceAdapter;

import day4Homework.Conceretes.StarbucksCustomerManager;
import day4Homework.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1,"berke","þenel",new Date(1999,01,12),"46138554220");
		customerManager.save(customer);
		
		

	}

}
