package 기말고사;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class 파일읽고쓰기 {

	public static void main(String[] args) {
		File infile = new File("./bin/기말고사/야호.txt");
		File outfile = new File("c:\\Temp\\out.txt");
		
		Scanner in = null;
		PrintWriter out = null;
		
		try {
			in = new Scanner(infile);
			out = new PrintWriter(outfile);
			
			while(in.hasNext())
			{
				String s = in.nextLine();
				System.out.println(s + " 콘솔에 출력");
				out.println(s + " 파일에 쓰기");
			}
			out.flush();
		}catch(FileNotFoundException e)
		{
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		finally {
			in.close();
			out.close();
		}
		
	}

}
