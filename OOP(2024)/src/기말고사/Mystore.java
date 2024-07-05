package 기말고사;

public class Mystore<T> {
	
	public T data;
	
	public T get() {
		return this.data;
	}
	
	public void set(T data)
	{
		this.data = data;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mystore<String> [] store1 = new Mystore[10];
		Mystore<Integer> [] store2 = new Mystore[10];
		
		store1[0] = new Mystore();
		store1[1].set("aaa");
		
		store2[0] = new Mystore();
		store2[1].set(3);
		
	}

}
