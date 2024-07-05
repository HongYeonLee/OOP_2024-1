package 기말고사;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class 동물{}

class 강아지 extends 동물{}

class 뱀 extends 동물{}

class 방울뱀 extends 뱀{}

class 자동차{}

public class ArrayListTest {
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>(); 
		
		
		list1.add("나는야");
		list1.add("이홍연");
		list1.add("학생이라네");
		list1.add(2, "컴공");
		list1.set(3, "과탑이라네");
		list1.remove(3);
		
		for (String a : list1)
		{
			System.out.println(a);
		}
		
		for (int i = 0; i < list1.size(); i++)
			System.out.println(list1.get(i));
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		Iterator <Integer> e = list2.listIterator();
		
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
		Box<String> box1 = new Box<String>();
		Box<강아지> box2 = new Box<강아지>();
		Box<뱀> box3 = new Box<뱀>();
		Box<방울뱀> box4 = new Box<방울뱀>();
		Box<자동차> box5 = new Box<자동차>();
		Box<동물> 동물농장 = new Box<동물>();
		
		box2.add(new 강아지());
		box3.add(new 뱀());
		box3.add(new 방울뱀()); //상속관계면 타입 달라도 가능
		box4.add(new 방울뱀());
		
		ArrayList<뱀> s1 = new ArrayList<뱀>(); //s1은 뱀, 방울뱀 저장 가능
		s1.add(new 뱀());
		s1.add(new 방울뱀());
		
		ArrayList<방울뱀> s2 = new ArrayList<방울뱀>();
		
		s2.add(new 방울뱀());
		
	}
}
