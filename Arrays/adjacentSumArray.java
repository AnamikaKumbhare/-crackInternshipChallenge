import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    int[] arr= new int[n-1];
		    for(int i=0;i<n-1;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int[] ans= new int[n];
		    ans[0]=1;
		    for(int i=1;i<n;i++){
		        ans[i]=arr[i-1]-ans[i-1];
		    }
		    for(int i=0;i<n;i++) System.out.print(ans[i]+" ");
		    System.out.println();
		    t--;
		}
          sc.close();
	}
}

