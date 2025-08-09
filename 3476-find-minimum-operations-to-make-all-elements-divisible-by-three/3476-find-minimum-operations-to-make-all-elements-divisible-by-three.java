class Solution {
    public int minimumOperations(int[] nums) {
        int h=0;
        for(int a:nums){
            if(a%3!=0){
                h++;
            }
        }return h;
    }
}