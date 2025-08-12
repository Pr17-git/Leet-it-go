class Solution {
    public int maximumDifference(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int t=nums[j]-nums[i];
                if(t==0){

                }else{
                l.add(t);
                }
            }
        }System.out.println(l);
        if(l.size()==0) return -1;
        int p=l.indexOf(-1);
        System.out.print(p);
        int h=Collections.max(l);
        if(h==-1146) return -1;
        return h;
    }
}