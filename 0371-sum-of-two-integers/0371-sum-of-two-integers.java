import java.math.BigInteger;
class Solution {
    public int getSum(int a, int b) {
        BigInteger l=new BigInteger(String.valueOf(a));
        BigInteger m=new BigInteger(String.valueOf(b));
        m=l.add(m);
        int i=m.intValue();
        return i;
    }
}