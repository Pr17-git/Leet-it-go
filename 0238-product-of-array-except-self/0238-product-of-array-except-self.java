class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c=Arrays.stream(nums).reduce(1,(a,b)->a*b);
        List<Integer>l=Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.print(c);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int j=nums[i];
                l.remove(i);
                int product = l.stream()
                            .reduce(1, (a, b) -> a * b);
                nums[i]=product;
                l.add(i,j);
            }else{
           nums[i]=c/nums[i];}
        }return nums;
    }
}