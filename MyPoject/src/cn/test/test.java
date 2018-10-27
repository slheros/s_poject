package cn.test;

import java.util.Scanner;

public class test {

		public static void main(String[] agrs) {
			Scanner in = new Scanner(System.in);
			String name = "";
			String passWord = "";
			for(int i=0;i<1;) {
				System.out.println("请注册用户");
				System.out.println("请输入注册用户名：");
				name=in.next();
				System.out.println("请输入注册密码：");
				passWord=in.next();
				System.out.println("请再次确认输入注册密码：");
				String passWord1=in.next();
				if(passWord.equals(passWord1)) {
					i=1;
				}
			}
			String name1;
			String passWord2;
			for(int i=0;i<0;) {
				System.out.println("请登陆");
				System.out.println("请输入用户名：");
				name1 = in.next();
				System.out.println("请输密码：");
				passWord2 = in.next();
				if ((name1.equals(name)) && passWord2.equals(passWord)) {
					System.out.println("恭喜您登陆成功，java欢迎您");
					i=1;
				}else {
					System.out.println("用户名或者密码不正确，请重新输入");
				}
		}

	}
}
