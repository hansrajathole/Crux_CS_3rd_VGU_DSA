import java.util.Scanner;

public class Array_Demo2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        Print(arr);
     
    }
    public static void Print(int[] arr){
        for(int i = 0;i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Swap(){
       
    }

}