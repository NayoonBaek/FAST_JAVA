package ch15;

import ch14.Bus;

public class Student {

	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		money -= 10000;
	}
	
	public void showStudentInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"원입니다.");
	}
}
