class Solution {
    public String sortSentence(String s) {
        String []arr=s.split(" ");
        String j="";
        for(int i=1;i<=arr.length;i++){
            String ch=""+i;
            for(String h:arr){
            if(h.contains(ch)){
                String w=h.replaceAll("[0-9]", "");
                if(i!=arr.length){
                    j=j+w;
                    j=j+" ";
                    break;
                }else{
                    j=j+w;
                    break;
                }
            }
        }
        }return j;
    }
}