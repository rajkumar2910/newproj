package org.oops;

public class Class1 implements Int1, Int2 {
	@Override
	public void name() {
	System.out.println("Rajini");	
		
	}
    @Override
    public void name1() {
    System.out.println("Danush");	
    	
    }
    public static void main(String[] args) {
		Class1 in=new  Class1();
		in.name();
		in.name1();
	}
}
