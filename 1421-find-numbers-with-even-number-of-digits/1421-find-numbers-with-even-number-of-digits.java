class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int a:nums){
            String s=Integer.toString(a);
            if(s.length()%2==0){
                c++;
            }
        }return c;
    }
}