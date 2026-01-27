public class Pattern21 {
    

    public static void main(String[] args) {
        
        int n = 5;
        int space = n*2-3;
        int star = 1;
        int row = 1;

        while (row<=n) {
            //Star
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }

            //Space
            int j = 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }


            //Star
            int k = 1;

            if(row==n)k=2;
            while (k<=star) {
                System.out.print("* ");
                k++;
            }


            //Next line prep
            space -=2;
            star++;
            row++;
            System.out.println();


        }
    }
}
