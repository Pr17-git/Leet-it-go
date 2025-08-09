class Solution {
    public int[] shuffle(int[] nums, int k) {
        List<Integer>l=new ArrayList<>();
        List<Integer>m=new ArrayList<>();
        List<Integer>n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i<k){
                l.add(nums[i]);
            }else{
                m.add(nums[i]);
            }  
        }
        for(int i=0;i<l.size();i++){
            n.add(l.get(i));
            n.add(m.get(i));
        }
        int arr[]=n.stream().mapToInt(Integer::intValue).toArray();
        return arr;
        }
    }