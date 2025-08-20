class Solution {
    public int heightChecker(int[] h) {
        int y=0;
        List<Integer>l=Arrays.stream(h).boxed().collect(Collectors.toList());
        Collections.sort(l);
        for(int i=0;i<h.length;i++){
            if(l.get(i)!=h[i]){
                y++;
            }
        }return y;
    }
}