package org.oops;

public class OverRide extends RunTimePoly {
	@Override
	public void sampA() {
		System.out.println("RNA");	
		}
	@Override
	public void sampB() {
		System.out.println("DNA");
	}
	public static void main(String[] args) {
		OverRide r=new OverRide();
		r.sampA();
		r.sampB();
	}

}
