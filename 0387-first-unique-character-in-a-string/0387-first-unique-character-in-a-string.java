class Solution {
    public int firstUniqChar(String s) {
        List<Character>l=s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        int k=0;
        int y=0;
        for(int i=0;i<l.size();i++){
            char b=l.get(i);
            k=0;
            for(int j=0;j<l.size();j++){
                if(i==j){
                  y++;
                }
                else if(b==l.get(j)){
                    k++;
                    if(k>=2){
                        break;
                    }
                }
            }if(k==0){
                return i;
            }
        }
        return -1;
    }
}