package 소융창;

public class 도서대여시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (도서대여신청() == "도서대여가능")
		{
			대여완료();
			return;
		}
		else
		{
			
			if(도서대여예약() == "예약가능")
			{
				예약된도서반납확인();
				예약된도서대출();
				return;
			}
			else
			{
				예약취소();
				return;
			}
		}
	}

	private static String 도서대여신청() {
		// TODO Auto-generated method stub
		System.out.println("도서대여를 신청한다");
		return "도서대여가능";
	}

	private static void 대여완료() {
		// TODO Auto-generated method stub
		System.out.println("도서 대여 완료");
	}

	private static String 도서대여예약() {
		// TODO Auto-generated method stub
		System.out.println("도서예약을 한다");
		return "예약가능";
	}

	private static void 예약된도서반납확인() {
		// TODO Auto-generated method stub
		System.out.println("예약된 도서 반납을 확인한다");
	}

	private static void 예약된도서대출() {
		// TODO Auto-generated method stub
		System.out.println("예약된 도서를 대출한다");
	}

	private static void 예약취소() {
		// TODO Auto-generated method stub
		System.out.println("도서예약을 취소한다");
	}

}
