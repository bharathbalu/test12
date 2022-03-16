package test2;
import test2.child;
import test2.parent11;

public class parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent11 obj1=new parent11();
        obj1.show();
        parent11 obj2=new child();
        obj2.show();
	}

}

class parent11{
	void show()
	{
		System.out.println("Parents show()");
	}
}

class child extends parent11{
	void show()
	{
		System.out.println("Child show()");
	}
}