class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ex) {
        int a=Arrays.stream(candies).max().orElse(0);
        System.out.print(a);
        List<Boolean>l=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int b=candies[i]+ex;
            if(b>=a){
                l.add(true);
            }else{
                l.add(false);
            }
        }
        return l;
    }
}