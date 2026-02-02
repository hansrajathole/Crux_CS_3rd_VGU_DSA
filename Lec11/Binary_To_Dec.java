package Lec11;

public class Binary_To_Dec {
    
    public static void main(String[] args) {
        int n = 100111;
        int mul = 1;
        int sum = 0;
        int des = 10;
        int src = 2;

        while(n>0){
            int rem = n%des;
            sum = sum+rem*mul;
            n = n/des;
            mul = mul*src;
        }

        System.out.println(sum);
    }
}
