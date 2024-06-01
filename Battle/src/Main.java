import Player.Player;
import Player.노엘;
import Player.리암;
import View.MyView;

public class Main {
	
	public static void 콘솔run(Player p1, Player p2) {
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
			System.out.println();

			try {
				Thread.sleep(1000); //1000이 1초 쉬기, throws하면 os가 처리
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

		if (p1.getHp() > 0)
			System.out.println(p1.name +"이(가) 이겼습니다!");
		
		else if (p2.getHp() > 0)
			System.out.println(p2.name + "이(가) 이겼습니다!");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new 노엘("노엘", 120, 20, "노엘1.png", "노엘2.png");
		Player p2 = new 리암("리암", 150, 10, "리암1.png", "리암2.png");

		//콘솔run(p1, p2);
		new MyView(p1, p2);
	}

}
