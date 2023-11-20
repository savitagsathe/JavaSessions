package java11_ConstructorConcept;

import java.util.ArrayList;

public class TestUni {

	public static void main(String[] args) {
		ArrayList<String>puneUniCourseList=new ArrayList<String>();
		puneUniCourseList.add("BA");
		puneUniCourseList.add("MA");
		puneUniCourseList.add("chemistry");
		puneUniCourseList.add("history");
		
        Uni u1=new Uni("pune","shivajinagar",puneUniCourseList);
    
        System.out.println(u1.getName()+""+u1.getHq());
        System.out.println(u1.getCourseList());
        
        u1.setHq("Delhi");
        System.out.println(u1.getName()+""+u1.getHq());
        
    
    
	}

}
