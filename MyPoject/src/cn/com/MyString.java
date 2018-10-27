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
	 * 功能：Java读取txt文件的内容 
	 * 步骤：
	 * 1、先获得文件句柄 
	 * 2、获得文件句柄当做是输入一个字节码流，需要对这个输入流进行读取
	 * 3、读取到输入流后，需要读取生成字节流 
	 * 4、一行一行的输出。readline()。 备注：需要考虑的是异常情况
	 * 
	 * @param filePath
	 */
	public static String readTxtFile(String filePath) {
		try {
			String encoding = "GBK";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
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
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
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
		String filePath = "E:\\控制台\\数据修正\\2018-10-26\\2car9.unl";
		String filePath1 = "E:\\控制台\\数据修正\\2018-10-26\\2car9.txt";
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
		System.out.print("完成,总计"+count);

	}
}
