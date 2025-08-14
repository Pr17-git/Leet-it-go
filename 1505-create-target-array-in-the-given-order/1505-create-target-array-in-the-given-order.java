class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer>l=new ArrayList<>(Collections.nCopies(nums.length, 0));
        for(int i=0;i<nums.length;i++){
            if(index[i]<i){
                l.add(index[i],nums[i]);
            }else{
                l.set(index[i],nums[i]);
            }
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}