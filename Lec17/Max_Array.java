public class Max_Array {
   public static void main(String[] args) {
        int [] arr = {10,2,8,3,5,0};
       
        int ans = Search(arr);
        System.out.println(ans);

    }

    public static int Search(int[]arr ){
        int max = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }
}
