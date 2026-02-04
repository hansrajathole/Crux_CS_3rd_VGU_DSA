public class Pascal {
    public static void main(String[] args) {
        int n = 6;
        int row = 1;
        int digit = 1;

        while(row<=n){
            //Number print
            int num = 1;
            int col = 1;
            while(col<=row){
                System.out.print(num);
                num = num*(row-col)/(col);
                col++;
            }

            // Next
            row++;
            digit++;
            System.out.println();
        }
    }
}