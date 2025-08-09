class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        System.out.print(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                l++;
            }
        }return l;
    }
}