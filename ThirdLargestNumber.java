package com.app.arrays;

import java.util.Arrays;

public class ThirdLargestNumber {

	public static void thirdLargest(int[] array)
	{
		Arrays.sort(array);
		int len=array.length;
		int thirdNumb=0;
		if(len>2)
		{
			thirdNumb=array[len-3];
			System.out.println("Third largest number is "+thirdNumb);

		}
		else
		{
			System.out.println("Invalid Input, array size is less than 3");
		}
	}
	public static void main(String[] args) {
		thirdLargest(new int[] {6, 8, 1, 9, 2, 1, 10, 12});
	}

}
