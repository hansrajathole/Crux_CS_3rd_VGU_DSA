

public class Pattern27 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = 1;
        int row = 1;
        
        while (row <= n) {
            
            // Space 
            int i =1;
            while (i<=space) {
                System.out.print("\t");
                i++;
            }
            // Star
            int j = 1;
            int val = 1;
            while (j<= star) {
                System.out.print(val+"\t");
                if(j<row)val++;
                else val--;
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
