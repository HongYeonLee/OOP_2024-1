package Player;
public class 알렉스 extends Player {

    public 알렉스(){
    }

    public 알렉스(String name, int hp, int power, String image_live, String image_dead, String attackName){
    	super(name, hp, power, image_live, image_dead, attackName);
    }
    
    public String attack(Player target)
    {
    	String result = "";
    	if (this.getStress() < 10)
    	{
    		result += super.attack(target);
        	result += this.name + "가 " + target.name + "에게 담배 연기를 내뿜습니다\n" + target.name + "에게 " + this.getPower() + " 공격이 들어갔습니다!\n";
    	}
    	return result;
    }
    
    public String 스트레스해소()
    {
    	String txt = "";
    	txt += super.스트레스해소() + "알렉스 : 치즈먹어야지 냠냠\n" + this.name + "의 스트레스 : " + this.getStress();
    	
    	return txt;
    }
}
