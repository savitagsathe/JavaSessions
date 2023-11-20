package java11_ConstructorConcept;

import java.util.ArrayList;
import java.util.List;

public class Uni {
	private String name;
	private String hq;
	private ArrayList<String> courseList;
	
	public Uni(String name,String hq,ArrayList<String> courseList) {
		
		this.name=name;
		this.hq=hq;
		this.courseList=courseList;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public void setHq(String hq) {
		this.hq=hq;
	}
	public void seUniList(ArrayList<String> courseList) {
		this.courseList=courseList;
	}

	
	public String getName() {
		return name;
	}
	
	public String getHq() {
		return hq;
	}
	public List<String> getUniList() {
		return courseList;
	}
}


