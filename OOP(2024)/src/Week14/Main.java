package Week14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
//		File infile = new File("c:\\Temp\\in.txt");
		
		File infile = new File("./src/Week14/연습"); //상대경로 사용하기
		File outfile = new File("c:\\Temp\\out.txt"); //절대경로 사용하기
		
		Scanner in = null;
		PrintWriter out = null;
		
		
		try {
			in = new Scanner(infile);
			out = new PrintWriter(outfile);
			out.println("=============================");
			//infile 파일에서 읽은 후, 콘솔에 한번, 파일에 한번 쓰자
			
			while(in.hasNext()) {
				String s = in.nextLine();
				System.out.println(s + "야호!"); //콘솔 출력
				out.println(s + "메롱!"); //파일 출력
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("파일 열기/쓰기 중에 문제 발생했음");
			e.printStackTrace();
		}finally {
			in.close();
			out.close();
		}
		System.out.println("끝");
		
		
	
		
	}
}
