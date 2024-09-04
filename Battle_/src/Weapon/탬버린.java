package Weapon;
import Player.Player;

public class 탬버린 extends Weapon {

    public 탬버린(){
    }

    public 탬버린(String name, int power, double 무기공격확률, double 추가능력확률){
    	super(name, power, 무기공격확률, 추가능력확률);
    }
    
	public String attack(Player target, Player attacker){
		String result = super.attack(target, attacker);

		if (isSuccess)
		{
			if (Math.random() < this.get추가능력확률())
				result += this.탬버린던지기(attacker);
			else
				result += "리암의 탬버린 던지기는 그렇게 효과적이지 않았습니다...\n";
		}
		
		return result;
	}
    
    public String 탬버린던지기(Player 리암) {
    	
    	String txt = "탬버린 소리가 리암의 정신을 일깨웁니다...\n" + "리암의 power가 3 증가하였습니다\n";
    	리암.setPower(리암.getPower() + 3);
    	
    	return txt;
    }
}
