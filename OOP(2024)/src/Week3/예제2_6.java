package Week3;

public class 예제2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 3, c = 3;
		a += 3; //이 라인을 실행한후 a = a + 3 = 6
		b *= 3; // b = b*3 = 9
		c %= 2; // c = c&2 = 1
		
		System.out.println("a  = " + a + ", b = " + b + ", c = " + c);
		
		int d = 3;
		a = d++; // a = 3, d =4, d를 먼저 사용하고 증가
		System.out.println("a = " + a + ", d = " + d);
		
		a = ++d; // d = 5, a = 5, d를 먼저 증가시킨 후 대입
		System.out.println("a = " + a + ", d = " + d);
		
		a = d--; // a = 5, d = 4
		System.out.println("a = " + a + ", d = " + d);
		
		a = --d; // d = 3 , a = 3
		System.out.println("a = " + a + ", d = " + d);
	}
}
