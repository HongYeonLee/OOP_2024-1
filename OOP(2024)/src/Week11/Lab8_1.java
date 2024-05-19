package Week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab8_1 {
	
	static class MyDice<T>{
		T result = null; //주사위 결과 값
		ArrayList<T> list;
		
		public MyDice() //기본생성자
		{
			list = new ArrayList<T>();
		}
		
		public MyDice(T t) //타입파라미터형 변수를 입력받을 경우
		{
			this();
			result = t; //주사위 결과 값 초기화
			showType(); //제네릭 타입 보이기
		}

		public void showType() {
			// TODO Auto-generated method stub
			System.out.println("이 주사위의 요소의 타입은 " + result.getClass().getSimpleName() + "입니다");
		}
		
		public void 구르기()
		{
			int rand = (int)(Math.random()*1000)%list.size(); //list의 크기 만큼 리턴
			result = list.get(rand); //리턴 타입으로 형변환, 색깔 주사위면 rand 인덱스에 해당하는 색 리턴, 숫자도 마찬가지
		}
		
		public void setDiceToColor()
		{
			System.out.println("색깔을 무지개색으로 세팅합니다.");
			String colors = "빨강색, 주황색, 노랑색, 초록색, 파랑색, 남색, 보라색";
			String[] arr = colors.split(" "); //빈 칸으로 구분하여 문자열의 배열로 저장
			
			 for (String s : arr) //for-each문 활용
				 list.add((T)s);
		}
		
		public void setDiceToNumber(int size)
		{
			System.out.printf("Integer %d개로 세팅합니다. \n", size);
			
			for (Integer i = 0; i < size; i++)
			{
				Integer num = i + 1; //list의 원소로 넣기 위해서 int형이 아닌 Integer형으로 선언
				list.add((T)num);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		MyDice dice = null;
		String s = "";
		int num = 0;
		
		System.out.println("주사위 타입을 선택하세요: 1-색깔, 2-숫자");
		System.out.print("선택 : ");
		int type = input.nextInt();
		input.nextLine(); //엔터 먹어가기
		
		System.out.print("값을 입력합니다 : ");
		
		if (type == 1)
		{
			dice = new MyDice<String>(""); //public MyDice(T t) 호출, 초기화용으로 공백 전달
			dice.setDiceToColor();
		}
		
		if (type == 2)
		{
			dice = new MyDice<Integer>(0); //초기화용으로 0 전달
			dice.setDiceToNumber(6); //6면 주사위
		}
		
		System.out.println(dice.list);
		dice.구르기();
		System.out.println("랜덤하게 고른 값은 " + dice.result + "입니다");
		
	}
}
