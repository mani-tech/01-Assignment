package com.app.arrays;

import java.util.Arrays;

public class SecondMaxAndMin {

	public static void secondMaxMin(int[] array)
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
		int count=0;
		for(int k=0;k<j;k++) 
		{
			System.out.print(temp[k]+" ");
			count++;
		}
		System.out.println("number of elements after removing duplicates is "+count);
		
		System.out.println("Second Minumum element "+temp[1]);
		System.out.println("Second Maximum element "+temp[count-2]);

	}
	public static void main(String[] args) {
		secondMaxMin(new int[] {1, 2, 5, 9, 6, 4, 7, 2});

	}

}
