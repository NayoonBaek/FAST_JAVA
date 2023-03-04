package ch14;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "번의 승객 수는"+passengerCount+"명이고, 수입은 "+money+"원입니다.");
	}

}