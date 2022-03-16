package test1;

import test1.child;
import test1.parent;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent obj1 = new parent();
		obj1.m2();
		parent obj2= new child();
        obj2.m2();
	}

}

class parent{
	private void m1()
	{
		System.out.println("From parent m1()");
	}
	protected void m2()
	{
		System.out.println("From parent m2() ");
		
	}
}
class child extends parent{
	private void m1()
	{
		System.out.println("From child m1()");
	
	}
	public void m2()
	{
		System.out.println("From child m2()");
	}
	
}