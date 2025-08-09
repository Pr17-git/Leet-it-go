class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer>l=Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int i=0;i<nums.length;i++){
             l.add(nums[i]);
        }System.out.print(l);
        int ans[]=l.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}