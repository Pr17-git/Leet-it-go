class Solution {
    public String firstPalindrome(String[] words) {
        String h="";
        for(int i=0;i<words.length;i++){
            if(isPla(words[i])){
                h+=words[i];
                break;
            }
        }return h;
    }
    public static boolean isPla(String j){
        boolean g=true;
        int f=0;
        int l=j.length()-1;
        while(f<l){
            if(j.charAt(f)==j.charAt(l)){
                f++;
                l--;
            }else{
                g=false;
                f++;
            }
        }return g;
    }
}