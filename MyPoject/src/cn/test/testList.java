package cn.test;

import java.util.ArrayList;
import java.util.List;

public class testList {

	public static void main(String[] args) {
		List<prpLPersion> persionList =new ArrayList<prpLPersion>();
		System.out.println(persionList.get(0));
	}
	
}

class prpLPersion{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
