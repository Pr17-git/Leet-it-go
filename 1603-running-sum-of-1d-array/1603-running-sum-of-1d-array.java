class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]=new int [nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int y=0;
            for(int j=0;j<=i;j++){
                y+=nums[j];
            }arr[i]=y;
        }return arr;
    }
}