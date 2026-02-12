public class Linear_Search{
    public static void main(String[] args) {
        int [] arr = {4,2,8,3,5,0};
        int target = 7;

        int ans = Search(arr, target);
        System.out.println(ans);

    }

    public static int Search(int[]arr ,int target){
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]== target){
                return i;
            }
        }

        return -1;
    }
}