package Lec36;

import java.util.Arrays;

public class Aggressive_cows {
    public static void main(String[] args) {
        int stall[] = {1,2,8,4,9};
        int cow = 3;
        Arrays.sort(stall);
        int l = 0;
        int h = stall[stall.length-1]-stall[0];
        int ans = 1;
        while (l<=h) {
            int mid = (l+h)/2;
            if(isitPossible(mid, stall,cow)){
                ans = mid;
                l = mid+1;
            }else{
                h = mid-1;
            }
        }

        System.out.println(ans);
    }
    public static boolean isitPossible(int dec , int []stall ,int noc){
            int pos = stall[0];
            int cow = 1;

            for(int i = 1 ; i<stall.length ;i++){
                if(stall[i]-pos >= dec){
                    cow++;
                    pos = stall[i];
                }
                if(cow == noc){
                    return true;
                }
            }
            return false;
    }
}
