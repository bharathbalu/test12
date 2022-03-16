package test2;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer>l1=new ArrayList<Integer>();
		  l1.add(50);
		  l1.add(60);
		  l1.add(70);
		  l1.add(80);
		  l1.add(90);
		  System.out.println( "Marks of students before grace : " + l1);
		  List<Integer>updatedmarks=l1.stream().map(i->i+5).collect(Collectors.toList());
		  System.out.println("Marks of students  after grace : " + updatedmarks);
	}

}
