package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {

		System.out.println("customer sell");
	}

	@Override
	public void buy() {

		System.out.println("customer buy");		
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}// buy, sell 둘 중 하나 하던가 재정의 하던가
	
	public void hello() {
		System.out.println("hello");
	}

}
