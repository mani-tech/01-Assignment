package com.app.arrays;

import java.util.Arrays;

public class SumOfUniqueElemets {

	public static void uniqueElements(int array[])
	{
		Arrays.sort(array);
		
		int len=array.length;
		int[] temp=new int[len];
		int j=0;
		for(int i=0;i<len-1;i++)
		{
			if(array[i]!=array[i+1])
			{
			temp[j++]=array[i];
			}
		}
		temp[j++]=array[len-1];
		int sum=0;
		
		for(int k=0;k<j;k++)
		{
			sum=sum+temp[k];
		}
		System.out.println("sum of unique elements is "+sum);
	}
	public static void main(String[] args) {
		uniqueElements(new int[] {5,7,9,5,6,8});

	}

}
