package com.app.arrays;

public class SumEqualsElements {

	public static void pairOfElements(int[] array,int sum)
	{
		int len=array.length;
		for(int i=0;i<len;i++)
		{
		for(int j=i+1;j<len;j++)
		{
			if(array[i]+array[j]==sum)
			{
				System.out.println("The elements which are equal to sum is ("+array[i]+","+array[j]+")");
			}
		}
		
		}
	}
	public static void main(String[] args) {
		pairOfElements(new int[]{7,8,3, 6,12, 8,9, -8, 10 } ,16);
	}

}
