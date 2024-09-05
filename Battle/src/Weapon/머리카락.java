package Weapon;
import java.util.ArrayList;

import Player.Player;
import View.Main;

public class 머리카락 extends Weapon {

	public 머리카락(){
	}

	public 머리카락(String name, int power, double 무기공격확률, double 추가능력확률){
		super(name, power, 무기공격확률, 추가능력확률);
	}

	public String attack(Player target, Player attacker){
		String result = super.attack(target, attacker);
		
		if (isSuccess)
		{
			if(Math.random() < this.get추가능력확률())
				result += this.머리카락뽑기(Main.blur);
			else
				result += "본헤드의 머리카락 뽑기는 그렇게 충격적이지 않았습니다...\n";
		}
		
		return result;
	}

	public String 머리카락뽑기(ArrayList<Player> targets) {
		
		String txt = "본헤드가 머리카락을 뽑아 blur에게 충격을 주었습니다!\n" + "blur가 스트레스를 호소합니다...\n";
		
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
