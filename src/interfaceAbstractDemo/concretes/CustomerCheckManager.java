package interfaceAbstractDemo.concretes;

import interfaceAbstractDemo.abstracts.PersonCheckService;
import interfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		return true;
		
	}

	
}
