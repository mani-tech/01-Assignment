package com.app.arrays;

public class CommonElementsInArrays {

	public static void commonElements(int[] array1,int[] array2,int[] array3)
	{
		int len1=array1.length;
		int len2=array2.length;
		int len3=array3.length;
		
		for(int i=0;i<len1;i++)
		{
			for(int j=0;j<len2;j++)
			{
				for(int k=0;k<len3;k++)
				{
					if(array1[i]==array2[j] && array1[i]==array3[k])
					{
						System.out.print(array1[i]+" ");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		commonElements(new int[] {1, 5, 10, 20, 40, 80}
		,new int[] {6, 7, 20, 80, 100}
		,new int[] {3, 4, 15, 20, 30, 70, 80, 120});
	}

}
