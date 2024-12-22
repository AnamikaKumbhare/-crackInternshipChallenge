import java.util.*;
class Mex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the array
            int[] arr = new int[n];
            Set<Integer> unique = new HashSet<>();
            boolean hasZero = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                unique.add(arr[i]);
                if (arr[i] == 0) {
                    hasZero = true;
                }
            }
            
            if (unique.size() == n && hasZero) {
                // Array contains all distinct elements including zero
                System.out.println(1);
            } else if (hasZero) {
                // Array contains duplicates and zero
                System.out.println(2);
            } else {
                // Array does not contain zero
                System.out.println(2);
            }
        }
        sc.close();
    }
}
