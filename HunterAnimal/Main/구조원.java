package Main;

import Animal.강아지;
import Animal.고양이;
import Animal.동물;
import Animal.토끼;
import Animal.햄스터;
import 장소.동물농장;
import 장소.숲속;
import 장소.보호소;

public class 구조원 {
	동물농장 farm = 동물농장.getInstance();
	숲속 forest = 숲속.getInstance();
	보호소 shelter = 보호소.getInstance();
	
	int 구조원money = 0;
	
	public 구조원() {
		System.out.println("===================================");
		System.out.println("  구조원이 나타났습니다! 동물들을 구해봅시다!");
		System.out.println("===================================");
	}
	
    public 구조원(int size){
    	this();
    	보호소 shelter = 보호소.getInstance(size);
    }
    
    public void showInfo() {
    	System.out.println("------------------------------------------------");
    	System.out.println("구조원의 보호소 크기 : " + shelter.getSize()); //place의 getSize() 메소드 호출
    	System.out.println("구조원의 돈 : " + 구조원money +"만원");    	
    	System.out.println("구조원에 있는 동물 수 : " + shelter.numOfAnimals); //place의 numOfAnimals
    	System.out.println("------------------------------------------------");
    	
    	shelter.showAnimals(); //place의 showAnimals() 메소드 호출
    }
    
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("# 구조원의 보호소 :");	
		shelter.showAnimals(); //place 클래스의 showAnimals() 메소드 호출
	}
	
    public boolean 구조하기(동물 ani){    	
    	System.out.println("무조건 동물을 구조한다!! " + ani.이름);    	
    	return true;
    }
    
    public boolean 구조하기(강아지 dog){
    	System.out.println("구조원이 강아지를 구조하려 합니다...");
    	boolean signal = doRandom(dog);
    	return signal;
    }
    
    public boolean 구조하기(고양이 cat){
    	System.out.println("구조원이 고양이를 구조하려 합니다...");
    	boolean signal = doRandom(cat);
    	return signal;
    }
   
    public boolean 구조하기(토끼 rabbit){
    	System.out.println("구조원이 고양이를 구조하려 합니다...");
    	boolean signal = doRandom(rabbit);
    	return signal;  
    }
    
    public boolean 구조하기(햄스터 ham){
    	System.out.println("구조원이 햄스터를 구조하려 합니다...");
    	boolean signal = doRandom(ham);
    	return signal;  
    }
    
    public boolean doRandom(동물 animal) {
    	
    	int r = (int)(Math.random()*1000)% 100;
    	if( r < animal.get구조확률()) {
    		System.out.println("구조원이 " + animal.이름 + " 구조하기를 성공했습니다!");
    		return true;
    	}
    	else System.out.println("구조원이 " + animal.이름 + " 구조하기를 실패했습니다...");   	
    	return false;
    }
    
    public void 구조하기()
    {
    	farm.show(); //숲속에 있는 동물 보여주기
    	System.out.print("어떤 동물을 구조하겠습니까? : ");
    	String name = Main.input.next(); //메인에서 인풋 변수 전역으로 선언하기
    	동물 target = null;
    	boolean sig = false;
    	
    	if (name.equals("강아지"))
    	{
    		target = farm.getDog();
    		if (target != null)
    			sig = 구조하기((강아지)target);
    	}
    	else if (name.equals("고양이"))
    	{
    		target = farm.getCat();
    		if (target != null)
    			sig = 구조하기((고양이)target);
    	}
    	else if (name.equals("토끼"))
    	{
    		target = farm.getRabbit();
    		if (target != null)
    			sig = 구조하기((토끼)target);
    	}
    	else if (name.equals("햄스터"))
    	{
    		target = farm.getHamster();
    		if (target != null)
    			sig = 구조하기((햄스터)target);
    	}
    	else
    		System.out.println("그런 동물은 없습니다.");
    	
    	if(sig == true) {
    		//동물농장의 동물 지우고 보호소에 동물 추가하기
    		farm.removeAnimal(target); //place 클래스의 removeAnimal(동물 ani) 메소드 호출
    		shelter.addAnimal(target); //place 클래스의 addAnimal(동물 ani) 메소드 호출
    		getMoney();
    	}
    }
    
    public void getMoney()
    {
		//1만원 ~ 4만원 사이의 돈 획득
    	int earn = (int)(Math.random()*100000)%30000 + 10000;
    	this.구조원money += earn; //0 ~ 10만원 -> 3만원으로 나눈 나머지 -> 0 ~ 2만 999..원 + 1만원 
		System.out.println("구조에 성공하여 기부금 " + earn + "원을 받았습니다! (현재 구조원 돈: " + this.구조원money + "원)");
    	
    	if (this.구조원money >= 100000) //10만원 이상 모았을 경우
    		getFree();
    }
    
    public void getFree()
    {
    	System.out.println("구조원이 기부금으로 10만원 이상을 모았습니다!");
    	System.out.println("브로커의 동물농장을 매매할 수 있게되었습니다!");
    	System.out.println("동물농장의 동물들이 모두 보호소로 이동합니다...");
    	
    	for (int i = 0; i < farm.numOfAnimals; i++)
    		shelter.addAnimal(farm.getAnimals()[i]);
    	
    	farm.removeAll();
    	farm.show();
    	shelter.show();
    	Main.flag = 1;
    }
}
