package Week12;

import Week12.player.Player;
import Week12.player.Pororo;

public class Main {

	private static void 콘솔run(Player p1, Player p2) {
		// TODO Auto-generated method stub

		Player attacker, target;
		while(true)
		{
			if (p1.getHp() <= 0 || p2.getHp() <= 0) break;

			if ((int)(Math.random()*100)%2 == 1)
			{
				attacker = p1;
				target = p2;
			}

			else
			{
				attacker = p2;
				target = p1;
			}

			attacker.attack(target);
			attacker.show();
			target.show();

			try {
				Thread.sleep(1000); //1000이 1초 쉬기, throws하면 os가 처리
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

		if (p1.getHp() > 0)
			System.out.println(p1.name +"가 이겼습니다!");
		else if (p2.getHp() > 0)
			System.out.println(p2.name + "가 이겼습니다!");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//name, hp, power, stress
		Player p1 = new Player("짱구", 100, 25, "짱1.png", "짱2.png"); //실제로 만들때는 Player 객체로 만들지 말고
		Player p2 = new Player("미미", 100, 10, "미1.png", "미2.png");

		//콘솔run(p1, p2);
		new Mywin(p1, p2);


	}

}
