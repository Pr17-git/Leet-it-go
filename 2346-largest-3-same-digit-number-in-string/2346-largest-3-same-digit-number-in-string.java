class Solution {
    public String largestGoodInteger(String str) {
        String h="";
        String a="";
        int u=0;
        List<String>l=new ArrayList<>();
        for(int i=0;i<str.length()-2;i++){
            char t=str.charAt(i);
             if(str.charAt(i)==t&&str.charAt(i+1)==t&&str.charAt(i+2)==t){
                if(u==0){
                u++;
                h+=t;
                h+=t;
                h+=t;
                a+=h;
                l.add(a);
                }else{
                    h="";
                    h+=t;
                    h+=t;
                    h+=t;
                    l.add(h);
                }
            }
        }System.out.println(l);
        if(u==0){
            return a;
        }
        if(l.size()==0){
            return "";
        }
        int arr[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            int d=Integer.parseInt(l.get(i));
            arr[i]=d;
        }
        int g=Arrays.stream(arr).max().orElse(0);
        String k=Integer.toString(g);
        if(k.length()==1){
            k="000";
        }
        return k;
    }
}