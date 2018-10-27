package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyString {
	/**
	 * ���ܣ�Java��ȡtxt�ļ������� 
	 * ���裺
	 * 1���Ȼ���ļ���� 
	 * 2������ļ��������������һ���ֽ���������Ҫ��������������ж�ȡ
	 * 3����ȡ������������Ҫ��ȡ�����ֽ��� 
	 * 4��һ��һ�е������readline()�� ��ע����Ҫ���ǵ����쳣���
	 * 
	 * @param filePath
	 */
	public static String readTxtFile(String filePath) {
		try {
			String encoding = "GBK";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // �ж��ļ��Ƿ����
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// ���ǵ������ʽ
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = "";
				String allLine = "";
				while ((lineTxt = bufferedReader.readLine()) != null) {
					allLine = allLine + lineTxt;
				}
				// System.out.println(allLine);
				read.close();
				return allLine;
			} else {
				System.out.println("�Ҳ���ָ�����ļ�");
			}
		} catch (Exception e) {
			System.out.println("��ȡ�ļ����ݳ���");
			e.printStackTrace();
		}
		return "";

	}

	public static void writeTxtFile(String filePath, String str) {
		File file = new File(filePath);
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			output.write(str);
			output.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String argv[]) {
		String filePath = "E:\\����̨\\��������\\2018-10-26\\2car9.unl";
		String filePath1 = "E:\\����̨\\��������\\2018-10-26\\2car9.txt";
		String str = "";
		// "res/";
		String all = readTxtFile(filePath);
		String[] alls = all.split("\\|");
		int count=0;
		for (int i = 0; i < alls.length - 5; i = i + 6) {
			str += alls[i] + "|" + alls[i + 1] + "|" + alls[i + 2] + "|"
					+ alls[i + 3] + "|" + alls[i + 4]+ "|" + alls[i + 5]+"\r\n";
			System.out.println(alls[i] + "|" + alls[i + 1] + "|" + alls[i + 2] + "|"
					+ alls[i + 3] + "|" + alls[i + 4]+"|" + alls[i + 5]+"\r\n");
			++count;
		}
		// for(int i=0;i<alls.length;i++){
		// str+=alls[i]+"|";
		// }
		writeTxtFile(filePath1, str);
		System.out.print("���,�ܼ�"+count);

	}
}
