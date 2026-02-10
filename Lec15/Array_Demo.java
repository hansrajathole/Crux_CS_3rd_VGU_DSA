public class Array_Demo{
    public static void main(String[] args) {
        // int[] arr = new int[5];
        int[] arr = {10,20,30,40};
        Swap(arr[0], arr[1]);

        System.out.println(arr.length);
        System.out.println(arr[0]+ " "+ arr[1]);
    }

    public static void Swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

}