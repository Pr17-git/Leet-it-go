class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int l[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int k=0;
            int h=arr[i];
            for(int j=0;j<arr.length;j++){
                 if(h>arr[j]){
                    k+=1;
                }  
            }
            l[i]=k;
        }return l;
    }
}