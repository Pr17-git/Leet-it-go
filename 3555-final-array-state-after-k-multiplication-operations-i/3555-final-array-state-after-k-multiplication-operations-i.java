class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        int l=0;
        List<Integer>p=Arrays.stream(nums).boxed().collect(Collectors.toList());
        while(l<k){
                int u=Collections.min(p);
                int g=p.indexOf(u);
                p.set(g,u*mul);
                l++;              
        }
        int arr[]=p.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}