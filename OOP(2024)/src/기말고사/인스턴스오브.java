package 기말고사;

class Person{
}

class Student extends Person{
	
}

class Researcher extends Person{
	
}

class Professor extends Researcher{
	
}

public class 인스턴스오브 {

	public static void work(Person p) {
		if (p instanceof Person) System.out.println("일을 한다");
		
		if (p instanceof Student) System.out.println("공부를 한다");
		
		if (p instanceof Researcher) System.out.println("연구를 한다");
		
		if (p instanceof Professor) System.out.println("수업 준비를 한다");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person a = new Student();
		Person b = new Researcher();
		Person c = new Professor();
		
		work(a);
		work(b);
		work(c);
		
		if ("java" instanceof String) System.out.println("스트링도 클래스");
		
	}
	

}
