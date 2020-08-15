package com.app.arrays;

public class FindingDuplicates {

	public static void main(String[] args) {
		
		int[] iarray= {2,5,6,2,8,6,7,3,7};
		
		for(int i=0;i<iarray.length;i++)
		{
			for(int j=i+1;j<iarray.length;j++)
			{
				if(iarray[i]==iarray[j])
				{
					System.out.print(iarray[i]+",");
				}
			}
		}
	}

}
