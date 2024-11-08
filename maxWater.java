public class maxWater {
    public static int maxArea(int [] height){
        int maxWat = 0;
        for(int i = 0;i<height.length;i++){
            int j = height.length - 1;
            int width = j - i ;
            int len = Math.min(height[i] , height[j]);
            maxWat = Math.max(maxWat , width*len) ; 
            if (height[j] < height[i] ){
                j -- ;
            }
        }
        System.out.println(maxWat);
        return maxWat ; 
        
        
    }
    public static void main(String [] args){
        int arr[] = {1,1} ;
        maxArea(arr);
    }
}
