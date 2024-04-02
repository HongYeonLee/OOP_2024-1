package Week4;

public class Lab_3_3 {
	public static void main(String[] args)
	{
		char c = 'a';
		
		do {
			System.out.print(c);
			c++; // 또는 c = (char)(c+1);
		}
		while(c <= 'z');
	}
}
