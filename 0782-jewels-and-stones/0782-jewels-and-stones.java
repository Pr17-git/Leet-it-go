class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int h=0;
        for(int i=0;i<jewels.length();i++){
            char a=jewels.charAt(i);
            int j =(int)stones.chars().filter(c -> c == a).count();
            h+=j;
        }return h;
    }
}