package Week11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lab8_5 {
	public static void main(String[] args)
	{
		ArrayList<String> s1 = new ArrayList<String>();
		List<String> s2 = new ArrayList<String>(); //업캐스팅 (독수리를 동물로 받기)
		List<Integer> s3 = new ArrayList<Integer>();
		ArrayList s4 = new ArrayList(); //잡동사니 박스, 꺼낼 때마다 형변환을 해줘야 해서 불편함
		
		s2.add("!1sda");
		//s2.add(1231);
		
		s3.add(123);
		//s3.add("asdq");
		
		s4.add(1231);
		s4.add("asda");
		
		
		s1.add("야호");
		s1.add("룰루");
		s1.add("123");
		s1.add("asda");
		
		for (int i = 0; i < s1.size(); i++)
			System.out.println(s1.get(i));
		
		Iterator e = s1.listIterator();
		while(e.hasNext())
			System.out.println(e.next());
		
		
		
		
		Scanner input = new Scanner(System.in);
	}

	
		
	
}
