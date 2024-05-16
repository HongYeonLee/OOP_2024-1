package Week11;

class 동물{
	
}

class BoxG <T> {
	private T data;
	
	public void set(T data)
	{
		this.data = data;
	}
	
	public T get()
	{
		return this.data;
	}
}

public class Main_generic {
	public static void main(String[] args)
	{
		BoxG<String> s1 = new BoxG<String>();
		BoxG<Integer> s2 = new BoxG<Integer>();
		BoxG<Double> s3 = new BoxG<Double>();
		BoxG<동물> s4 = new BoxG<동물>();
		
		s1.set("짱구");
		s2.set(123);
		s3.set(3.14);
		s4.set(new 동물());
		
		//s1.set(1234);
	}
}
