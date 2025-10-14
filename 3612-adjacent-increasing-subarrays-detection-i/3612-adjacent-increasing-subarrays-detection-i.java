class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> l, int k) {
        // if(k==1){
        //     return true;
        // }
        for(int i=0;i<=l.size()-(k*2);i++){
            int y=0;
            boolean b=false;
            List<Integer>n=new ArrayList<>();
            List<Integer>m=new ArrayList<>();
            for(int j=i;j<i+k;j++){
                n.add(l.get(j));
            }
            m.addAll(n);
            Collections.sort(m);
            System.out.println(n);
            System.out.println(m);
            if(m.equals(n)){
                for(int g=0;g<n.size()-1;g++){
                    if(n.get(g)>=n.get(g+1)){
                        y++;
                        break;
                    }
                }
                if(y==0) b=true;
                }
            n.clear();
            m.clear();
            for(int h=i+k;h<(i+k)+k;h++){
                n.add(l.get(h));
            }
            m.addAll(n);
            Collections.sort(m);
            System.out.println(n);
            System.out.println(m);
            if(m.equals(n)&&b==true){
                for(int g=0;g<n.size()-1;g++){
                    if(n.get(g)>=n.get(g+1)){
                        y++;
                        //b=false;
                        break;
                    }
                }
                if(y==0) return true;
            }
        }
        return false;
    }
}