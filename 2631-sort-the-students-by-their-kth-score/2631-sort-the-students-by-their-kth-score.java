class Solution {
    public int[][] sortTheStudents(int[][] s, int k) {
        int[][]arr=new int[s.length][s[0].length];
        List<Integer>l=new ArrayList<>();
        Map<Integer,Integer>m=new TreeMap<>();
        for(int i=0;i<s.length;i++){
            l.add(s[i][k]);
            m.put(s[i][k],i);
        }Collections.sort(l);
        int p=0;
        int h=0;
        while(p<m.size()){
            int r=m.get(l.get((l.size()-1)-p));
            for(int i=0;i<s[0].length;i++){
                arr[h][i]=s[r][i];
            }
            h++;
            p++;
        }
        System.out.println(Arrays.deepToString(arr));
        return arr;
    }
}