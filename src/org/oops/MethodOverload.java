package org.oops;

public class MethodOverload {
	public void student(int id) {
	System.out.println(id);	
	}
    public void student(long admin) {
	System.out.println(admin);
	}
    public void student(int id,String name) {
    	System.out.println(id+name);
		}
    public static void main(String[] args) {
		MethodOverload d=new MethodOverload();
		d.student(1429);
		d.student(9876543214l);
		d.student(1429, "Rajkumar");
	}

	
}
