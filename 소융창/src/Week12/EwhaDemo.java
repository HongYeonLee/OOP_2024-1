package Week12;

//부모클래스 = 슈퍼클래스 = 상위클래스
class Ewha
{
	//이름, 주소
	String name;
	String addr;
	
	Ewha(String name, String addr)
	{
		this.name = name;
		this.addr = addr;
	}
	
	
	void showInfo()
	{
		System.out.println(name);
		System.out.println(addr);
	}
}



//학생클래스(학부생, 대학원생) 정의
class Student extends Ewha{
	//속성-멤버변수정의
	//메소드-멤버메소드정의
	//학번, 이름, 학과, 성적
	
	//문자열은 디폴트로 null값, 정수는 0, 실수는 0.0
	/*private*/ String num;
	/*private*/ String name;
	String dept;
	
	//생성자 정의
	Student(String num, String name, String dept) {
		super("이대", "서대문구"); //자식의 생성자에서 부모의 생성자를 먼저 불러야함
		this.num = num;
		this.name = name;
		this.dept = dept;
	}
	
	
	void showInfo() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(dept);
	}


	public String getNum() {
		return num;
	}


	public String getName() {
		return name;
	}


	public String getDept() {
		return dept;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	//접근자/변경메소드 - getter/setter
	
	
}

public class EwhaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s = new Student();
		Student s1 = new Student("2371049", "이홍연", "컴공");
		
		//s.name = "이홍연";
		//s.num = "2371049";
		//s.dept = "컴공";
		s1.showInfo();
	}

}
