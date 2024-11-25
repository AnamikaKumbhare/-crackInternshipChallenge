package Math;

class Solution {
    public boolean canAliceWin(int n) {
        int count=0, pile=10;
        while(n>=pile){
            n-=pile;
            pile--;
            count++;
        }
        return count%2!=0; 
    }
}
