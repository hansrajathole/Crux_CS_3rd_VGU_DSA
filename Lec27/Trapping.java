public class Trapping {
    public static void main(String[] agrs) {

        int height [] = {5,4,2,1,7};
        int left[] = new int[height.length];
        left[0] = height[0];

        for(int i = 1 ;  i< height.length ; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        int right[] = new int[height.length];
        right[height.length-1] = height[height.length-1];

        for(int j = height.length-2 ;  j>=0 ; j--){
            right[j] = Math.max(right[j+1], height[j]);
        }

        int totalWater = 0;
        for(int k = 0 ; k<height.length ; k++){
            totalWater += Math.min(left[k], right[k])-height[k];
        }

        
    }
}