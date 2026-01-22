package Lec5;
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;

        while (row <= n) {
            
            // Star
            int i = 1;
            while(i<= star){
                if(row == 1 || row == n || i == 1 || i == n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
                i++;
            }

            row++;
            System.out.println();
        
        }
    }
}