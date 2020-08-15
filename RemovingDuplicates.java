package com.app.arrays;

import java.util.Arrays;

public class RemovingDuplicates {

	public static void duplicates(int iarray[])
	{
		Arrays.sort(iarray);
		
		int[] temp=new int[iarray.length];
		
		int j=0;
		
		for(int i=0;i<iarray.length-1;i++)
		{
			if(iarray[i]!=iarray[i+1])
			{
				temp[j++]=iarray[i];
			}
		}
		
		temp[j++]=iarray[iarray.length-1];
		
		for(int k=0;k<j;k++) 
		{
			System.out.print(temp[k]+" ");
		}
	}
	public static void main(String[] args) {
		duplicates(new int[] {1, 2, 5, 5, 6, 6, 7, 2});
	}

} 
