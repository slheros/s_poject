package cn.test;

import java.util.Scanner;

public class test {

		public static void main(String[] agrs) {
			Scanner in = new Scanner(System.in);
			String name = "";
			String passWord = "";
			for(int i=0;i<1;) {
				System.out.println("��ע���û�");
				System.out.println("������ע���û�����");
				name=in.next();
				System.out.println("������ע�����룺");
				passWord=in.next();
				System.out.println("���ٴ�ȷ������ע�����룺");
				String passWord1=in.next();
				if(passWord.equals(passWord1)) {
					i=1;
				}
			}
			String name1;
			String passWord2;
			for(int i=0;i<0;) {
				System.out.println("���½");
				System.out.println("�������û�����");
				name1 = in.next();
				System.out.println("�������룺");
				passWord2 = in.next();
				if ((name1.equals(name)) && passWord2.equals(passWord)) {
					System.out.println("��ϲ����½�ɹ���java��ӭ��");
					i=1;
				}else {
					System.out.println("�û����������벻��ȷ������������");
				}
		}

	}
}
