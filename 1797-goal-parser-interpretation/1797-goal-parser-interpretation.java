class Solution {
    public String interpret(String str) {
        String str1="";
        for(int i=0;i<str.length();i++){
            if(i==str.length()-1){
                    if(str.charAt(i)=='('){
                        break;
                    }
                }
            if(Character.isLetter(str.charAt(i))){
                char h=str.charAt(i);
                str1+=h;
            }else if(str.charAt(i)=='('&&str.charAt(i+1)==')'){
                str1+="o";
                i++;
            }
        }return str1;
    }
}