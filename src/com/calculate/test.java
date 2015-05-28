package com.calculate;

public class test {
	public static void main(String[] args)
	{
		Calculate test=new Calculate();
		System.out.println("加法运算："+test.add(12, 13));
		System.out.println("减法运算："+test.subtract(18, 2));
		System.out.println("乘法运算："+test.multiply(2, 6));
		System.out.println("除法运算："+test.divide(4, 4));
	}
}
