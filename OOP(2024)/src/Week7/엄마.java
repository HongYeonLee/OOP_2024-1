package Week7;

public class 엄마 extends Week7.할머니 {
    private String 일기장;
    public 핸드폰 핸드폰압수bag; //핸드폰 타입의 변수 핸드폰압수bag을 만듦

    //할머니 클래스의 요리하기 오버라이딩
    public void 요리하기(){
    	System.out.println("엄마가 요리를 합니다");
    	System.out.println("스파게티를 만들어요");
    	System.out.println();
    }

    public void 청소하기(){
    	System.out.println("엄마가 청소를 합니다");
    	System.out.println("구석구석 깨끗해요");
    	System.out.println();
    }

    public void 할머니처럼요리하기(){
    	System.out.println("엄마가 할머니에게 요리를 해달라 했습니다");
    	
    	//super는 바로 위의 상위 클래스를 참조할 때 사용
    	//엄마의 바로 위 상위클래스는 할머니이므로 할머니 클래스의 요리하기 메소드를 호출
    	//할머니 g = new 할머니();
    	//g.요리하기(); 이렇게 사용해도 동일하다
    	super.요리하기();
    }

    public void 핸드폰뺏기(짱구 아들){
    	System.out.println("엄마가 짱구의 핸드폰을 뺏습니다");
    	
    	//짱구 클래스에서 getPhone() 메소드를 실행해서 핸드폰 압수bag 변수를 채움
    	this.핸드폰압수bag = 아들.getPhone();
    	
    	//짱구 클래스에서 setPhone() 메소드에 null 값을 전달해 짱구 클래스의 핸드폰 변수를 null값으로 만듦
    	아들.setPhone(null);
    	System.out.println();
    }
}
