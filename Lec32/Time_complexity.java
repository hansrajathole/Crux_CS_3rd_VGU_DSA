import static java.lang.System.out;

public class Time_complexity {
    public static void main(String[] args) {
        

        // long start = System.currentTimeMillis();

        // for(int i = 0 ; i< 1000_000 ; i++){
            
        // }
        // long end = System.currentTimeMillis();

        // System.out.println(end -start);

           int low = 0;
        int high = arr.length-1;

        while (low<= high) {
            int mid = (low+high)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]> target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

       return -1;

       while (i < n) {
			System.out.println("Hey");
			// O(n)
			i++;
		}

        while (i <= n) {
			System.out.println("Hey");
            // O(log n)
			i *= 2;
		}

        while (n > 0) {
			System.out.println("Hey");
			// O(log n)
			n /= 2;
		}


        while (i <= n) {
			System.out.println("Hey");
            // O(n)
			i += 2;
			i += 3;
		}


        while (i <= n) {
			System.out.println("Hey");
            // O(log n)
			i *= 2;
			i *= 3;
		}


        for (i = 1; i * i <= n; i++) {
           //  O(sqrtN)
			System.out.println("hey");
		}

        for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
               // O(N4)
					System.out.println("hey");
				}
			}
		}

        for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			
		}

        for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for ( k = n; k >0; k = k / 2) {
					System.out.println("hey");
                    O(n2 log n )
				}
			}
		}

        
        for(int i = 1 ; i< 1000_000 ; i*= 5){
           // O(log n) 
        }


    }
}