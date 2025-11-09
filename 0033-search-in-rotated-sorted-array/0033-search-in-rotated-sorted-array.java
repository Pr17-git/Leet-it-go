class Solution {
    public int search(int[] nums, int target) {
        int a=0;
        boolean b=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                b=true;
                a=i;
                break;
            }
        }
        if(b==false) return -1;
        return a;
    }
}