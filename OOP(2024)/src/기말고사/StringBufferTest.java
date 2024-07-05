package 기말고사;

public class StringBufferTest {
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(8, "my ");
		System.out.println(sb);
		
		sb.setLength(4);
		System.out.println(sb);
		
	}
}
