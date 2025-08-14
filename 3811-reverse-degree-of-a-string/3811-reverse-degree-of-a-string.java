class Solution {
    public int reverseDegree(String s) {
        Map<Character,Integer>m=new HashMap<>();
        int h=26;
        int j=0;
        for(char i='a';i<='z';i++){
            m.put(i,h--);
        }
        for(int i=0,y=1;i<s.length();i++,y++){
            int g=m.get(s.charAt(i));
            System.out.println(g);
            j+=(g*y);
        }
        return j;
    }
}