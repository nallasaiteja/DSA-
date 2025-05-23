class Solution {
    public int maxArea(int[] height) {
        int maxt=0;
        int minh=0;
        int minw=0;
        int max=0;
        int worst=0;
        for(int i=0;i<height.length;i++){
            if(worst<height[i]){
            for(int j=i+1;j<height.length;j++){

                minh=Math.min(height[i],height[j]);
                minw=j-i;
                max=minh*minw;
                if(maxt<max){maxt=max;}
                
             }
            }
            worst=Math.max(worst,height[i]);
        }
        return maxt;
    }
}