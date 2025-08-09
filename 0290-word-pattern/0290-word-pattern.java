class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String>h=new HashMap<>();
    char []a=pattern.toCharArray();
    a=new String(a)   
            .chars()                                   
            .distinct()                                
            .mapToObj(c -> (char) c)                   
            .collect(StringBuilder::new,               
                     StringBuilder::append,
                     StringBuilder::append)
            .toString()
            .toCharArray();                            
    String []st=s.split(" ");
    st=Arrays.stream(st).distinct().toArray(String[]::new);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(st));
    if(a.length==st.length){
        for(int i=0;i<a.length;i++){
            h.put(a[i],st[i]);
        }
    }else{
        return false;
    }
    System.out.println(h);
    String str="";
    for(int i=0;i<pattern.length();i++){
        String f=h.get(pattern.charAt(i));
        if(i!=pattern.length()-1){
        str+=f+" ";
        }else{
            str+=f;
        }
    }System.out.println(str);
    if(str.equals(s)) return true;
    return false;
    }
}