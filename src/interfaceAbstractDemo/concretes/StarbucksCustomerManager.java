package interfaceAbstractDemo.concretes;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.PersonCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	PersonCheckService personCheckService;
	
	
	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		this.personCheckService = personCheckService;
	}


	@Override
	public void save(Customer customer) {
		if (personCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
	}


}
