class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        int f=1;
        int e=n-1;
        while(f<=e){
            String a=Integer.toString(f);
            String b=Integer.toString(e);
            if((a.contains("0")==false)&&(b.contains("0")==false)&&e+f==n){
                arr[0]=f;
                arr[1]=e;
                break;
            }else{
                e--;
                f++;
            }
        }
        return arr;
    }
}