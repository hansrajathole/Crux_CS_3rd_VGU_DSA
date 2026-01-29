package Lec9;

public class Prime_Factors {
    public static void main(String[] args) {
        int n = 378;

        int i = 2;
        while (i<=n) {
            if(n%i == 0){
                n = n/i;
                System.out.println(i);
            }else {
                i++;
            }
        }
    }
}
