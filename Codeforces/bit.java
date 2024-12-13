import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int x = 0; 

        for (int i = 0; i < n; i++) {
            String temp = sc.next(); 
            if (temp.charAt(1) == '+') { 
                x++; 
            } else if (temp.charAt(1) == '-') { 
                x--; 
            }
        }

        System.out.println(x); 
        sc.close();
    }
}
