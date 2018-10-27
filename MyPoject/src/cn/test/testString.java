package cn.test;

public class testString {

	public static void main(String[] args) {
		String s = "01234567";
		System.out.println(s.substring(1));
	}
	
}

class Persion{
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
