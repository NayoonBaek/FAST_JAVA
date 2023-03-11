package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		//진짜 얘가 가지고 있는(없어지는 게 아냐) 해시코드 보고 싶을 땐,
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//				
//		Integer i = 100; //new Integer안해도 됨.
//		
//		System.out.println(i.hashCode());
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();
		//생성이 아니라 인스턴스 상태를 그대로 복제해서 만드는 것.
//		하위클래스들도 그대로 복제할 때 사용 가능
		System.out.println(copyStudent);
	}

}

