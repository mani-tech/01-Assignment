package com.app.arrays;

public class MaxAndMinElements {

	public static void maxAndmin(int[] array)
	{
		int len=array.length;
		int min=array[0];
		int max=array[0];
		for(int i=0;i<len-1;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("minimum=>"+min+"  "+"maximum=> "+max);
	}
	public static void main(String[] args) {
		
		maxAndmin(new int[] {1, 2, 5, 5, 6, 6, 7, 2});
	} 

}
