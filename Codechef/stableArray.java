package Codechef;

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            
            int seconds = 0; 
            Queue<Integer> indices = new LinkedList<>();
            boolean[] needsUpdate = new boolean[n - 1];
            
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    indices.add(i);
                    needsUpdate[i] = true;
                }
            }
            
            while (!indices.isEmpty()) {
                int currentSize = indices.size();
                boolean hasChanged = false;
                
                for (int j = 0; j < currentSize; j++) {
                    int idx = indices.poll();
                    
                    if (arr[idx] < arr[idx + 1]) {
                        arr[idx] = arr[idx + 1];
                        hasChanged = true;

                        if (idx > 0 && !needsUpdate[idx - 1] && arr[idx - 1] < arr[idx]) {
                            indices.add(idx - 1);
                            needsUpdate[idx - 1] = true;
                        }

                        if (idx + 1 < n - 1 && !needsUpdate[idx + 1] && arr[idx + 1] < arr[idx + 2]) {
                            indices.add(idx + 1);
                            needsUpdate[idx + 1] = true;
                        }
                    }
                    needsUpdate[idx] = false;
                }
                
                if (hasChanged) {
                    seconds++;
                }
            }
            
            System.out.println(seconds);
        }
        
        sc.close();
    }
}

