package largest_And_Smallest_Operations;

import java.util.Arrays;
import java.util.Scanner;

public class Diff_bw_2ndLargest_2ndSmallest 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Array " +Arrays.toString(arr));
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(arr[j]>arr[i])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		System.out.println("Sorted Array " +Arrays.toString(arr));
		int diff = 0;
		diff = arr[arr.length-2] - arr[1]; 
		System.out.println("Difference b/w 2nd Largest & 2nd Smallest is " + diff);
	}
}
