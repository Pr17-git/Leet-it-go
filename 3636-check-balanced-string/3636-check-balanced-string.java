class Solution {
    public boolean isBalanced(String num) {
        List<Integer>l=new ArrayList<>();
        List<Integer>m=new ArrayList<>();
        for(int i=0;i<num.length();i++){
            int y=Character.getNumericValue(num.charAt(i));
            if(i%2==0){
                l.add(y);
            }else{
                m.add(y);
            }
        }int a=l.stream().mapToInt(Integer::intValue).sum();
        int b=m.stream().mapToInt(Integer::intValue).sum();
        if(a==b){
            return true;
        }
        return false;
    }
}