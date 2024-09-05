package Weapon;
import Player.Player;

public class 기타 extends Weapon {

	public 기타(){
	}

	public 기타(String name, int power, double 무기공격확률, double 추가능력확률){
		super(name, power, 무기공격확률, 추가능력확률);
	}


	public String attack(Player target, Player attacker){
		String result = super.attack(target, attacker);

		if (isSuccess)
		{
			if (Math.random() < this.get추가능력확률())
				result += this.기타로작곡하기(target);
			else
				result += "노엘의 기타 작곡은 그렇게 감동적이지 않았습니다...\n";
		}
		
		return result;
			
	}

	public String 기타로작곡하기(Player target) {
		
		String txt = "노엘이 기타로 작곡한 노래가 끝내줘 " + target.name + "을(를) 감동시켰습니다\n" + target.name + "의 power가 3 감소합니다\n";
		target.setPower(target.getPower() - 3);
		
		return txt;
	}

}
