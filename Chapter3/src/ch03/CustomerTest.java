package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010,"이순신");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerinfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");

		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerinfo());
	
		Customer vc = new VIPCustomer(12345, "noname");
		
		
	}

}
