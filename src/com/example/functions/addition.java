package com.example.functions;

public class addition 
{
	private int i_num01;
	private int i_num02;
	private int i_total;
	
	private double d_num01;
	private double d_num02;
	private double d_total;
	
	private float f_num01;
	private float f_num02;
	private float f_total;
	
	public addition(int i_num01, int i_num02)
	{
		this.i_num01 = i_num01;
		this.i_num02 = i_num02;
		add(i_num01, i_num02);
	}
	
	private void add(int i_num01, int i_num02)
	{
		this.i_total = i_num01 + i_num02;
	}
	
	public int getTotal()
	{
		return i_total;
	}
}
