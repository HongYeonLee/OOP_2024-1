package Player;
public class 본헤드 extends Player {

    public 본헤드(){
    }

    public 본헤드(String name, int hp, int power, String image_live, String image_dead, String attackName){
    	super(name, hp, power, image_live, image_dead, attackName);
    }
    
    public String attack(Player target)
    {
    	String result = "";
    	
    	if (this.getStress() < 10)
    	{
    		result += super.attack(target);
        	result += this.name + "가 " + target.name + "에게 머리로 빛 반사를 날립니다\n" + target.name + "에게 " + this.getPower() + " 공격이 들어갔습니다!\n";
    	}
    	
    	return result;
    }
    
    public String 스트레스해소()
    {
    	String txt = "";
    	txt += super.스트레스해소() + "본헤드 : 피아노나 칠까?\n" + this.name + "의 스트레스 : " + this.getStress();
    	
    	return txt;
    }
}
