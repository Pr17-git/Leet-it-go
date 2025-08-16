class Solution {
    public int maximum69Number (int num) {
        Set<Integer>l=new TreeSet<>();
        l.add(num);
        String a=Integer.toString(num);
        for(int j=0;j<a.length();j++){
            String b="";
        for(int i=0;i<a.length();i++){       
            if(i==j){
            if(a.charAt(i)=='6'){
                b+="9";
            }else{
                b+="6";
            }
            }else{
             b+=a.charAt(i);   
            }
        }
        int y=Integer.parseInt(b);
        l.add(y);
        }
        List<Integer>m=new ArrayList<>(l);
        System.out.print(m);
        return m.get(m.size()-1);
    }
}