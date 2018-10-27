package cn.test;

public class TestNull {
	public static void main(String[] args) {
		String s = null;
		String interProvincial = s;
		if(interProvincial!=null && !"".equals(interProvincial.trim())){
			System.out.println(s);
		}
	}
}
