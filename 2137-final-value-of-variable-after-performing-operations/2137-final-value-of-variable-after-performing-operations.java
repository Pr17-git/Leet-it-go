class Solution {
    public int finalValueAfterOperations(String[] operations) {
      int h=0;
      for(String k:operations){
        if(k.equals("X--")||k.equals("--X")){
            h=h-1;
        }else if(k.equals("X++")||k.equals("++X")){
            h=h+1;
        }
      }  return h;
    }
}