//PROGRAM NO:8 write a java program to ckeck whether the given array is mirror inverse or not
import java.io.*;
import java.util.*;
class arrayinverse
{
	public static void main(String args[])
	{
		int count=0;
		int arr[]={3,4,5,0,1,2};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]]==1)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("The given array is mirror inverse");
		}
		else
		{
			System.out.println("The given array is not mirror");
		}
	}
}