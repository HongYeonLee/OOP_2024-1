package Week12;

import java.util.StringTokenizer;

public class Lab6_6 {
	public static void main(String[] args)
	{
		String s = "사과/바나나/망고=포도=딸기=오렌지*메론*참외*";
		
		//String으로 분리하기
		String[] t = s.split("/"); //무조건 분리자(=/)는 하나, 문자열을 분리하니 여러개의 문자열이 나옴 -> 문자열 배열로 받기
		
		for (String a : t)
			System.out.println(a); //사과, 바나나, 망고=포도=딸기=오렌지로 분리됨
		
		String[] tt = t[2].split("="); //t[2]는 망고=포도=딸기=오렌지, =로 분리
		
		for (String a : tt)
			System.out.println(a);
		
		//안되는 건 아닌데 조금 불편함
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(s, "/=*"); //문자열과 구분문자열을 한번에 줄 수있다, 구분문자는 여러개 가능!!
		
		while (st.hasMoreTokens()) //st야 남아있는 토큰 있어?
			System.out.println(st.nextToken()); // 있으면 다음거 출력해줘
		
	}
}
