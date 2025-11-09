class Solution {
    public int countOperations(int num1, int num2) {
        int a=10;
        if(num1==0||num2==0) return 0;
        int b=0;
        while(a>0){
            if(num1<num2){
                num2=num2-num1;
            }
            else if(num1>num2){
                num1=num1-num2;
            }
            else{
                num1=0-num2;
            }
            a=num1+num2;
            b++;
        }
        return b;
    }
}