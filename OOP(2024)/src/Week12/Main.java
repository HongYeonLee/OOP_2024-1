package Week12;

import Week12.player.Player;
import Week12.player.Pororo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//name, hp, power, stress
		Player p1 = new Pororo("짱구", 100, 25, 60); 
		Player p2 = new Pororo("미미", 100, 10, 20);
		
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
			
			Thread.sleep(1000); //1000이 1초 쉬기, throws하면 os가 처리
		}
		
		if (p1.getHp() > 0)
			System.out.println(p1.name +"가 이겼습니다!");
		else if (p2.getHp() > 0)
			System.out.println(p2.name + "가 이겼습니다!");
	}

}
