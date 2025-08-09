class Solution {
    public int xorOperation(int n, int start) {
        int o=0;
        for(int i=0;i<n;i++){
            o^=start+2*i;
        }return o;
        
    }
}