package Lec8;


public class Pattern33 {
    public static void main(String[] args) {
        int n = 10;
        int space = n-1;
        int star = 1;
        int row = 1;
        int val = n;
        while (row <= n) {
            
            // Space 
            int i =1;
            while (i<=space) {
                System.out.print("\t");
                i++;
            }
            // Star
            int j = 1;
            
            while (j<= star) {
                if(val == n){
                    System.out.print(0+"\t");
                }else {
                    System.out.print(val+"\t");
                }

                if(j<row){
                    val++;
                }else{
                    val--;
                }
                
                j++;
            }
            // Next line
            row++;
            space--;
            star += 2;
            System.out.println();
        }
    }
}
