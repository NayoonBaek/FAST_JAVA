package ch08;

public class PersonTest {
	
	

	public static void main(String[] args) {
		Person tomas = new Person(180, 78,"남성", "Tomas",37);
		tomas.getInfo();
		
		Person tom = new Person();
		tom.height = 181;
		tom.weight = 77;
		tom.gender = "남남";
		tom.name = "Tom";
		tom.age = 35;
		tom.getInfo();
		
	}
}
