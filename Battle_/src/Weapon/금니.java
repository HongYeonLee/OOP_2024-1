package Weapon;
import java.util.ArrayList;

import View.Main;
import Player.Player;

public class 금니 extends Weapon {

	public 금니(){
	}

	public 금니(String name, int power, double 무기공격확률, double 추가능력확률){
		super(name, power, 무기공격확률, 추가능력확률);
	}


	public String attack(Player target, Player attacker){
		String result = super.attack(target, attacker);
		if (isSuccess)
		{
			if (Math.random() < this.get추가능력확률())
				result += this.금니보여주기(Main.oasis);
			else
			{
				result += "데이먼의 금니는 그렇게 충격적이지 않았습니다...\n";
			}
		}
		return result;
			
	}

	public String 금니보여주기(ArrayList<Player> targets) {
		
		String txt = "데이먼이 금니를 보여줘 oasis가 충격에 빠졌습니다!\n" + "oasis 멤버 전원의 스트레스가 5 증가합니다\n";
		txt += "\n";
		for (Player p : targets)
		{
			txt += p.name + "의 스트레스가 5 증가하였습니다\n";
			p.setStress(p.getStress() + 5);
		}
		txt += "\n";
		
		return txt;
	}
}
