package Player;
public class 데이먼 extends Player {

    public 데이먼(){
    }
    
    public 데이먼(String name, int hp, int power, String image_live, String image_dead, String attackName){
    	super(name, hp, power, image_live, image_dead, attackName);
    }
    
    public String attack(Player target)
    {
    	String result = "";
    	
    	if (this.getStress() < 10)
    	{
    		result += super.attack(target);
        	result += this.name + "이 " + target.name + "을(를) 마이크로 때립니다\n" + target.name + "에게 " + this.getPower() + " 공격이 들어갔습니다!\n";
    	}
    	
    	return result;
    }
    
    public String 스트레스해소()
    {
    	String txt = "";
    	txt += super.스트레스해소() + "데이먼 : 새로운 밴드를 만들어야겠어\n" + this.name + "의 스트레스 : " + this.getStress();
    	
    	return txt;
    }
}
