class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int  right =height.length -1;
        int Areamax = 0;
        while(left < right){
            int area= Math.min(height[left],height[right])*(right - left);
            Areamax = Math.max(area,Areamax);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return Areamax;

        
    }
}