public class Min_Array {
     public static void main(String[] args) {
        int [] arr = {10,2,8,3,5,-3};
       
        int ans = Search(arr);
        System.out.println(ans);

    }

    public static int Search(int[]arr ){
        int min = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }
}
