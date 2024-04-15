package Week6_Lab;
import java.util.Scanner;
public class DiceGame {
	private int diceFace;
	private int userGuess;
	
	private void rollDice()
	{
		System.out.println("주사위를 굴립니다.");
		//Math.random() 함수는 0.0 ~ 1.0 사이의 실수를 반환
		//정수형으로 형변환 후 6을 곱하여 0 ~ 6으로 만든다
		//1을 더해 1 ~ 7 사이의 정수가 나오게 한다 (1, 2,..6이 나올 수 있다)
		this.diceFace = (int)(Math.random()*6 + 1);
		System.out.printf("%d(이)가 나왔습니다\n", diceFace);
	}
	
	private int getUserInput(String guess)
	{
		Scanner input = new Scanner(System.in);
		System.out.print(guess); //출력문구(예상값을 입력하시오) 출력
		return input.nextInt(); //유저 인풋값 받아 userGuess 변수에 리턴
	}
	
	private void checkUserGuess()
	{
		if (this.diceFace == userGuess)
			System.out.println("맞았습니다");
		else System.out.println("틀렸습니다");
	}
	
	public void startPlaying()
	{
		this.userGuess = getUserInput("예상값을 입력하시오: ");
		this.rollDice();
		this.checkUserGuess();
	}
}
