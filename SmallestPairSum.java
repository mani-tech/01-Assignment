package com.app.arrays;

import java.util.Arrays;

public class SmallestPairSum {

	public static void smallestPair(int[] array)
	{
		Arrays.sort(array);
		int[] temp=new int[array.length];
		int j=0;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]!=array[i+1])
			{
				temp[j++]=array[i];
			}
		}
		temp[j++]=array[array.length-1];
		System.out.println("Smallest pair sum is "+(temp[0]+temp[1]));
	}
	public static void main(String[] args) {
		smallestPair(new int[]{1, 7, 2, 9, 6});
	}

}
