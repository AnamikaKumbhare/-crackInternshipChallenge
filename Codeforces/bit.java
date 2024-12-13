package Codeforces;

import java.util.Scanner;

public class bit {
    public int bitPP() {
        int x = 0; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            String operation = sc.nextLine();
            if (operation.contains("++")) {
                x++;
            } else if (operation.contains("--")) {
                x--;
            }
        }

        sc.close(); 
        return x;
    }
}
