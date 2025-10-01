class Solution {
    public int numWaterBottles(int b, int t) {
        if(b<t) return b;
        int y=b;
        // if(b%t==0){
        //     while(b>=t){
        //     int k=b%t;
        //     if(k==0){
        //         y+=b/t;
        //         b=b/t;
        //     }else{
        //         System.out.println("oo");
        //         y+=b/t;
        //         b=(b%t)+(b/t);
        //     }
        // }
        // }else{
            while(b>=t){
                y+=b/t;
                b=(b%t)+(b/t);
            }
        // }
        return y;
    }
}