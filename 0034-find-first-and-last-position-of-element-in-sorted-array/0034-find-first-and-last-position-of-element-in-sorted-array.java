class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        boolean f=true;
        boolean b=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) b=false;
            if(nums[i]==target&&f==true){
                f=false;
                arr[0]=i;
                arr[1]=i;
            }
            if(nums[i]==target&&f==false){
                arr[1]=i;
            }
        }
        if(b==true){
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}