class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                a=a+nums[i];
            }else if(nums[i]<=99){
                b=b+nums[i];
            }
        }if(a>b||b>a){
            return true;
        }return false;
    }
}