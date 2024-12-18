package Codechef;

import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int cost=0;
            for(int i=0;i<arr.length;i++){
                cost+=(arr[i]-i>0) ? arr[i]-i : 0;
            }
            System.out.println(cost);
        }
	}
}

