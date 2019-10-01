package com.BinarySearch;


public class SortedAndRotatedArray {

	
	public static int findElementInSortedAndRotatedArray(int arr[],int element)
	{
		int start=0,end=arr.length-1,mid;
		while(start<=end)
		{
			mid = start+(end-start)/2;
			if(arr[mid]==element)
			{
				return mid;
			}
			if(arr[start]<=arr[mid])
			{
				if(arr[start]<=element&&arr[mid]>=element)
				{
					end= mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else
			{
				if(arr[mid]<=element&&arr[end]>=element)
				{
					start= mid+1;
				}
				else
				{
					end=mid-1;
				}				
			}
		}
		return -1;			
	}
	
	
public static void temp1(String name)
{
	System.out.println("String");
}

public static void temp1(StringBuffer name)
{
	System.out.println("StringBuffer");
}

	public static void main(String[] args) {
	    int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
        int i = findElementInSortedAndRotatedArray(arr, 6); 
        if (i != -1)  
            System.out.println("Index: " + i); 
        else
            System.out.println("Key not found");
        

	}

}
