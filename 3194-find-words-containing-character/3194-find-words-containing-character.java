class Solution {
    public List<Integer> findWordsContaining(String[] words, char u) {
        List<Integer>l=new ArrayList<>();
        String x=""+u;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.contains(x)){
                l.add(i);
            }
        }return l;
    }
}