import java.util.*;

public class NormalProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if (c == 'p') {
                    sb.append('q'); 
                } else if (c == 'q') {
                    sb.append('p'); 
                } else {
                    sb.append('w'); 
                }
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}
