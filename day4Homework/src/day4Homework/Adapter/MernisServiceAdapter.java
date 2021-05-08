package day4Homework.Adapter;

import day4Homework.Abstracts.CustomerCheckService;
import day4Homework.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy(); 
		boolean result=false;
		try {
			result = client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		} 
		catch (Exception e) {
		System.out.println(e);
		return false ;   
		}
		return result;
		
	}
	
}
