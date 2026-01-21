package Lec4;

public class Pattern2 {
    
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;

    while(row<=n){

        // Star
        int i = 1;
        while(i<= star) {
            System.out.print("* ");
            i++;
        }

        row++;
        star++;
        // next line prep
        System.out.println();

    }
    }
}
