class Solution {
    public String reversePrefix(String str, char ch) {
        String y="";
        y=y+ch;
        if(str.contains(y)){
        String a="";
        String b="";
        int n=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch||str.charAt(i)==ch){
                if(str.charAt(i)==ch&&n==0){
                    a=a+str.charAt(i);
                    n=10;
                }if(n<10){
                a=a+str.charAt(i);
                }
                if(n==10){
                    n+=1;
                }
                else if(n==11){
                    b=b+str.charAt(i);
                }
            }
        }
        System.out.print(a+" "+b);
        String jj="";
        for(int i=a.length()-1;i>=0;i--){
            jj=jj+a.charAt(i);
        }
        for(int i=0;i<b.length();i++){
            jj=jj+b.charAt(i);
        }
        return jj;
        }
            return str;
    }
}