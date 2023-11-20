package practice;

import java.util.ArrayList;

public class TestUni {
	public static void main(String args[]) {
		
		ArrayList<String>delhiUnicourseList=new ArrayList<String>();
		delhiUnicourseList.add("mathe");
		delhiUnicourseList.add("physics");
		delhiUnicourseList.add("Bio");
		
		Uni u1=new Uni("Pune","amravati",delhiUnicourseList);
		
		System.out.println(u1.getName()+""+u1.getHq());
		System.out.println(u1.getCourseList());
		
		u1.setHq("mumbai");
		
		System.out.println(u1.getName()+""+u1.getHq());
	   
	}
	
}
