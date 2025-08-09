class Solution {
    public int smallestEvenMultiple(int n) {
        boolean f=false;
        int i=1;
        int y=0;
        while(f!=true){
            if(i%2==0&&i%n==0){
                f=true;
                y=i;
            }i++;
        }return y;
    }
}