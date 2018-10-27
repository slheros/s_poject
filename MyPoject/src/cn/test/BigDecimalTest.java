package cn.test;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {

		BigDecimal b1 = new BigDecimal("1.04");
		System.out.println(b1);
		BigDecimal b2 = new BigDecimal("2.01");
		b1.add(b2);
		System.out.println(b1);
	}
}
