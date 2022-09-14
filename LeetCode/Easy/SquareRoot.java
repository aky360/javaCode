class Solution {
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.mySqrt(100));
    }
    
    public int mySqrt(int x) {
        int left=1,right =x, result=0;
        while(left<right){
            int mid = left + (right - left)/2;
            if(mid<x/mid){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return (left==x/left)?left:left-1;
    }
}