package Week12.player;
public class Pororo extends Player {

	private int stress;

	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}

	public Pororo(String name, int hp, int power, String image){
		//super(name, hp, power, image);
	}
	
	public Pororo(String name, int hp, int power, int stress, String image){
		//super(name, hp, power, image);
		this.stress = stress;
	}
	
    public void play(){
    	for (int i = 0; i < 3; i++)
    	{
    		System.out.println(this.name + " is playing~~~");
    		this.stress -= 5;
    		System.out.println(this.name + "stress : " + this.stress);
    	}
    	
    }

    //뽀로로의 attack을 변경해도 됨
	@Override
	public void attack(Player target) {
		// TODO Auto-generated method stub
		//스트레스가 50이상이면 공격못함. 놀게함
		//공격할 때마다 스트레스 +3
		if (stress > 50)
		{	
			System.out.println("스트레스가 높아서 공격못해요 놀거에요!!");
			this.play();
		}
		else
		{
			super.attack(target);
			this.stress += 3;
		}
			
			
	}

}
