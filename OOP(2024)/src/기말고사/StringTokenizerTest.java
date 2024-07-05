package 기말고사;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "가/나/다/라/마/바/사=아=자=차=카=타*고구마";
		
		String[] str = s.split("/");
		
		for (String a : str)
		{
			System.out.println(a);
		}
		
		StringTokenizer st = new StringTokenizer(s, "/=*");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
