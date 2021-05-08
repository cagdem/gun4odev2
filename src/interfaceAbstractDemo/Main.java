package interfaceAbstractDemo;

import java.time.LocalDate;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;
import interfaceAbstractDemo.concretes.NeroCustomerManager;
import interfaceAbstractDemo.concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer caglar = new Customer(1, "Çaðlar", "Demir", LocalDate.of(1995, 6, 21), "53197153622");
		Customer hatali = new Customer(2, "abcd", "abcd", LocalDate.of(1990, 1, 1), "11111111111");

		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(caglar);
		starbucksCustomerManager.save(hatali);

		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(caglar);
		neroCustomerManager.save(hatali);

	}

}
