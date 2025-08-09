class Solution {
    public int findLucky(int[] arr1) {
        int h=0;
        List<Integer>l=new ArrayList<>();
        int arr[]=Arrays.stream(arr1).distinct().toArray();
        for(int a:arr){
            int c=(int)Arrays.stream(arr1).filter(x->x==a).count();
            if(c==a){
                l.add(a);
                h++;
            }
        } 
        if(h>0) return Collections.max(l);
        return -1;
    }
}