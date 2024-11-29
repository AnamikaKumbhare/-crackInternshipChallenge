import java.util.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int a=0, b=0;
            for(char ch:s.toCharArray()){
                if(ch=='A'){
                    a++;
                    if(b>0){
                        b--;
                    }
                }else{
                    b++;
                    if(a>0){
                        a--;
                    }
                }
            }
            System.out.println(a+b);
        }
	}
}

