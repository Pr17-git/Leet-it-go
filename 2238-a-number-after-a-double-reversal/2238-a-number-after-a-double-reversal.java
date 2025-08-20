class Solution {
    public boolean isSameAfterReversals(int num) {
        if(10>num) return true;
        String h=Integer.toString(num);
        if(h.charAt(h.length()-1)=='0'){
            return false;
        }return true;
    }
}