/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class temp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int count=0;
		    int n = sc.nextInt(); //no of elements in array
		    int k = sc.nextInt(); //sub array size
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++)
		    {
		        arr[i] = sc.nextInt();
		    }//array input ho gya..
		    
		    for(int i=0; i<n; i++)
		    {
		        for(int j=i; j<i+k && i+k<n; j++)
		        {
		            if((arr[j]|arr[j+1]) % 2 != 0) count++;
		        }
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
