package 기말고사;

import java.util.ArrayList;

public class Box <T>{
	private T t = null;
	private T[] arr;
	private ArrayList<T> ar;
	
	private int i = 0;
	private final int size = 10;
	
	public Box()
	{
		ar = new ArrayList<T>();
	}
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public void add(T t)
	{
		this.t = t;
		ar.add(t);
	}
	
	public T get(int i)
	{
		return ar.get(i);
	}
	
	public int size() {
		return ar.size();
	}
	
	public static <T extends 동물> T getAnimal() {
		자동차 a = new 자동차();
		강아지 b = new 강아지();
		뱀 c = new 뱀();
		방울뱀 d = new 방울뱀();
		
		return (T)c; //(T)a는 문법 에러, 나머지는 전부 가능
	}
	
	public void put_super(ArrayList<? super T>t) {
		this.ar.addAll((ArrayList<T>) t);
	}
	
	public void put_sub(ArrayList<? extends T> t) {
		this.ar.addAll((ArrayList<T>) t);
	}
	
	public static <T> void copy(Box <? extends T> from, Box <? super T> to) {
		for (int i =0; i <from.size(); i++) {
			to.add(from.get(i));
		}
	}
	
	public void show() {
	    for(int i=0; i<this.size(); i++){
	        System.out.print( i+1 + ":" + ar.get(i).toString() + ", ");
	        System.out.println(ar.get(i).getClass().getTypeName());
	    }
	}
	
	
}
