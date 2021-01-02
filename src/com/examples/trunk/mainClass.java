package com.examples.trunk;

import com.example.functions.addition;

public class mainClass 
{
	public static void main(String[] args)
	{
		int num1 = 2;
		int num2 = 2;
		
		addition add = new addition(num1, num2);
		System.out.println(add.getTotal());
	}
}
