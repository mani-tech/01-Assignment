package com.app.arrays;

public class MaximumDifference {

	public static void maxdiff(int[] array)
	{
		/**
		 * 
		int len=array.length;
		Arrays.sort(array);
		System.out.println("maximum difference of array is "+(array[len-1]-array[0]));
	**/
		
		int min=array[0];
		int max=array[0];
		for(int i=0;i<array.length-1;i++)
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
		System.out.println("Maximum difference between two elements is "+(max-min));
		
	}
	public static void main(String[] args) {
		maxdiff(new int[] {2, 5, 1, 7, 3, 9, 5});
		maxdiff(new int[] {9, 2, 12, 5, 4, 7, 3, 19, 5});

	}

}
