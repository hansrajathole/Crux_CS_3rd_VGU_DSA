public class Rotate_Array {
    public static void main(String[] args) {
        

        int arr [] = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;
        k = k%n;
        Rotate(arr, n, k);
        Print(arr);

     }
     public static void Print(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
     }

     public static void Rotate(int arr [], int n , int k){
        for(int i = 0 ; i<k ; i++){
            int key = arr[n-1];
            int j;
            for(j = n-1 ; j>0 ; j--){
                arr[j] = arr[j-1];

            }
            arr[j] = key;
        }
     }
}
