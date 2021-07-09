import java.util.*;
import java.lang.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int n = sc.nextInt();
		System.out.println("enter the elements of the array");
		int [] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}

		//code to remove duplicate elements
		int res=1;
		for(int i=1; i<n;i++)
		{
			if(arr[i] != arr[res-1])
			{
				arr[res] = arr[i];
				res++;
			}
		}

		System.out.println("array without duplicates is:");
		for(int x=0; x<res; x++)
		{
			System.out.print(arr[x]);
		}
	}
}