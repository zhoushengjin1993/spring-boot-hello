package com.sabchow.test;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			testAge();
		} catch (HotelAgeException e) {
			// 当发生异常时打印：java.lang.Exception: 18岁以下，80岁以上的住客必须由亲友陪同
			e.printStackTrace();
		}
	}

	// 描述酒店的入住规则：限定年龄，18岁以下，80岁以上的住客必须由亲友陪同
	public static void testAge() throws HotelAgeException {
		System.out.println("请输入年龄：");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		String a = null;
		a.toUpperCase();
		// if (age < 18 || age > 80) {
		// throw new HotelAgeException("18岁以下，80岁以上的住客必须由亲友陪同");
		// } else {
		// System.out.println("欢迎入住本酒店");
		// }
	}
}
