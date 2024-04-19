package Week7;

public class 짱구 extends Week7.엄마 {
    private 핸드폰 짱구폰 = new 핸드폰(); //핸드폰 클래스의 짱구폰 객체를 만듦

    public void setPhone(핸드폰 짱구폰){
    	this.짱구폰 = 짱구폰;
    }

    public 핸드폰 getPhone(){
        return this.짱구폰;
    }
    
    //엄마 클래스의 요리하기 오버라이딩
    public void 요리하기(){
    	System.out.println("짱구가 요리를 합니다");
    	System.out.println("컵라면을 만들어요");
    	System.out.println();
    }

    //엄마 클래스의 청소하기 오버라이딩
    public void 청소하기(){
    	System.out.println("짱구가 청소를 합니다");
    	System.out.println("이불을 덮어요~");
    	System.out.println();
    }

    public void 열심히공부하기(){
    	System.out.println("짱구가 열심히 공부를 합니다");
    	System.out.println("열공 열공!!");
    	System.out.println();
    }

    public void 엄마처럼요리하기(){
    	System.out.println("짱구가 엄마에게 요리를 해달라 했습니다(super)");
    	super.요리하기();
    }

    //엄마 클래스의 할머니처럼요리하기 메소드를 오버라이딩?
    public void 할머니처럼요리하기(){
    	System.out.println("짱구가 엄마에게 할머니처럼 요리를 해달라 했습니다");
    	
    	//여기서 할머니처럼요리하기는 짱구 클래스의 할머니처럼요리하기 메소드가 아니라
    	//엄마 클래스의 할머니처럼요리하기 메소드임
    	//즉 엄마 클래스에서는 super.요리하기();를 통해
    	//할머니 클래스의 요리하기 메소드를 불러올것임
    	super.할머니처럼요리하기();
    }
    
    //짱구 클래스의 요리하기 메소드의 오버로딩
    public void 요리하기(엄마 짱구엄마){
    	System.out.println("짱구가 엄마에게 요리를 해달라 했습니다(짱구엄마.)");
    	짱구엄마.요리하기();
    }

    //짱구 클래스의 요리하기 메소드의 오버로딩
    public void 요리하기(할머니 짱구할머니){
    	System.out.println("짱구가 할머니에게 요리를 해달라 했습니다(짱구할머니.)");
    	짱구할머니.요리하기();
    }

    public void 공부하기(){
    	if(짱구폰 == null)
    	{
    		System.out.println("짱구가 엄마에게 핸드폰이 뺏겨 열심히 공부합니다");
    		열심히공부하기();
    	}
    		
    	else
    	{
    		System.out.println("짱구가 핸드폰이 있으니 공부하는 척을 합니다.");
    		for (int i = 0; i < 3; i++)
    			System.out.println("열심히 하는 척...");
    		System.out.println();
    	}			
    }
    
    public void 핸드폰몰래가져오기(엄마 짱구엄마)
    {
    	setPhone(짱구엄마.핸드폰압수bag);
    	짱구엄마.핸드폰압수bag = null;
    	System.out.println("짱구가 몰래 핸드폰을 가져왔습니다");
    	System.out.println();
    }

}
