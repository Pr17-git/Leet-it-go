class Solution {
    public int maximumWealth(int[][] arr) {
        int h=0;
        for(int i=0;i<arr.length;i++){
            int arr1[]=arr[i];
            int j=Arrays.stream(arr1).sum();
            if(h<j){
                h=j;
            }
        }return h;
    }
}