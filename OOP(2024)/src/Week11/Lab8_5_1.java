package Week11;

import java.util.ArrayList;

public class Lab8_5_1 {
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("우유");
		list.add("빵");
		list.add("버터");
		list.add(1, "사과"); //list의 1번 인덱스의 값을 사과로 끼어넣기, 빵 -> 사과 빵
		list.set(2, "포도"); //list의 2번 인덱스의 값을 포도로 대체, 버터 -> 포도
		list.remove(3); //list의 3번 인덱스 값을 제거
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
