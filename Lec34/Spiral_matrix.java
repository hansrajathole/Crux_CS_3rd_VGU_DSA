public class Spiral_matrix{
    public static void main(String[] args) {
        
        int arr[][] = {
            {1,4,7,11},
            {2,5,8,12},
            {3,6,9,16},
            {10,13,14,17},
            {18,21,23,26}};

        int minR = 0, maxR = arr.length-1 , minC = 0 , maxC = arr[0].length-1;
        
        while (minR<=maxR && minC<=maxC) {
            for(int i = minC ; i<= maxC ; i++){
                System.out.print(arr[minR][i]+", ");
            }
            minR++;
            for(int i = minR ; i<= maxR ; i++){
                System.out.print(arr[i][maxC]+", ");
            }
            maxC--;
            for(int i = maxC ; i>= minC ; i--){
                System.out.print(arr[maxR][i]+", ");
            }
            maxR--;
            for(int i = maxR ; i>= minR ; i--){
                System.out.print(arr[i][minC]+", ");
            }
            minC++;
        }
    }
}