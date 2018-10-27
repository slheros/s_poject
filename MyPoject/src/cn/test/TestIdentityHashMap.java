package cn.test;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class TestIdentityHashMap {

	public static void main(String[] args) {
		test1();
		test2();
		
	}
		public static void test1() {
			Map<String, String> newMap = new IdentityHashMap<String, String>();
			
			newMap.put(null, "1111");
			newMap.put(null, "2222");
			
			newMap.put(new String(""), "3333");
			newMap.put(new String("1111"), "4444");
			newMap.put(new String("1111"), "5555");
			newMap.put(new String("1111"), "6666");
			newMap.put(new String("2222"), "5555");
			newMap.put(new String("3333"), "6666");
			
			for (Entry<String, String> entry : newMap.entrySet()) {
			    System.out.print(entry.getKey() +"    ");  
			    System.out.println(entry.getValue()); 

			}
			
		    System.out.println("================================="); 
	}
		public static void test2() {
			Map<String, String> newMap = new HashMap<String, String>();
			
			newMap.put(null, "1111");
			newMap.put(null, "2222");
			
			newMap.put(new String(""), "3333");
			newMap.put(new String("1111"), "4444");
			newMap.put(new String("1111"), "5555");
			newMap.put(new String("1111"), "6666");
			newMap.put(new String("2222"), "5555");
			newMap.put(new String("3333"), "6666");
			
			for (Entry<String, String> entry : newMap.entrySet()) {
			    System.out.print(entry.getKey() +"    ");  
			    System.out.println(entry.getValue()); 

			}
	}
	
}
