package 소융창;

public class 도서관대출시스템 {
	public static void main(String[] args)
	{
		//메소드 종류: 정적 메소드, 인스턴스 메소드
		//정적 메소드는 객체를 생성하지 않고 멤버 사용 가능
		//인스턴스 메소드는 new 메소드를 이용해서 객체를 생성해야만 해당 멤버를 사용할 수 있다
		
		//로그인(); //쓰려면 로그인 메소드 앞에 static을 붙여야 한다
		
		도서대출문의();
		
		if (도서검색() == "있음")
		{
			if (회원여부확인() != "회원")
				회원등록();
			if (대출가능권수확인() == "대출가능권수있음")
			{
				도서대출();
				회원도서대출세부사항기록();
				도서상태갱신();
				return;
			}
			else
			{
				도서대출불가();
				return;
			}
		}
		else
		{
			도서없음();
			return;
		}

			
	}



	private static void 도서대출문의() {
		// TODO Auto-generated method stub
		System.out.println("도서 대출 문의");
	}
	
	private static String 도서검색() {
		// TODO Auto-generated method stub
		System.out.println("도서검색");
		return "있음";
	}
	
	private static String 회원여부확인() {
		// TODO Auto-generated method stub
		System.out.println("회원여부확인");
		return "회원";
	}
	
	private static void 도서없음() {
		// TODO Auto-generated method stub
		System.out.println("도서없음");
	}
	
	private static void 회원등록() {
		// TODO Auto-generated method stub
		System.out.println("회원등록");
	}
	
	private static String 대출가능권수확인() {
		// TODO Auto-generated method stub
		System.out.println("대출가능권수확인");
		return "대출가능권수있음";
	}
	
	private static void 도서대출() {
		// TODO Auto-generated method stub
		System.out.println("도서대출");
	}
	
	private static void 도서대출불가() {
		// TODO Auto-generated method stub
		System.out.println("도서대출불가");
	}
	
	private static void 회원도서대출세부사항기록() {
		// TODO Auto-generated method stub
		System.out.println("회원도서대출세부사항기록");
	}
	
	private static void 도서상태갱신() {
		// TODO Auto-generated method stub
		System.out.println("도서상태갱신");
	}








	


	
	//메소드 정의
	//static void 로그인(/*아이디, 패스워드를 매개변수로 받아야한다*/)
	//{
		//System.out.println("로그인한다.");
	//}
	
	//static String 회원가입()
	//{
		//System.out.println("회원가입여부확인");
		//return "Yes";
	//}
}
