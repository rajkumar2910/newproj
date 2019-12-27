package org.oops;

public class AbsClass extends Abstract{
@Override
public void met1() {
	System.out.println("kumar");

	}
public static void main(String[] args) {
	AbsClass ab=new AbsClass();
	ab.met1();
	ab.met2();
}
}
