class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        for(int i=0;i<n;i++){
            double h=Math.pow(3,i);
            if(h>n) return false;
            System.out.println(h);
            if(h==n) return true;
        }return false;
    }
}