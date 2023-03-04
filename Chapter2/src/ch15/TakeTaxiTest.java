package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Student edward = new Student("Edward",20000);
		Taxi taxiJ= new Taxi("잘나간다 운수");
		edward.takeTaxi(taxiJ);
		
		edward.showStudentInfo();
		taxiJ.showTaxiInfo();
		
		
	}

}
