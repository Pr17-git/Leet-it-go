class Solution {
    public int maxFreqSum(String s) {
        Set<Character>k=new HashSet<>();
        List<Character>c=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            c.add(s.charAt(i));
            k.add(s.charAt(i));
        }int y=0;
        int u=0;
        for(char h:k){
            String j=""+h;
            if(j.matches(".*[AEIOUaeiou].*")){
                int a=Collections.frequency(c,h);
                if(a>y){
                    y=a;
                }
            }else{
                int g=Collections.frequency(c,h);
                if(g>u){
                    u=g;
                }
            }
        }
        return u+y;
    }
}