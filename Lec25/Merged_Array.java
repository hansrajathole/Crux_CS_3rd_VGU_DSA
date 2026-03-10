
public class Merged_Array {
    public static void main(String [] args){
        int nums1[] = {1,3};
        int nums2[] = {6}; 

        int n = nums1.length;
        int m = nums2.length;

        int leng = n+m;

        int newArr [] = new int[leng];
        int i = 0, j = 0, k = 0;

        while(i<n && j<m){
            if(nums1[i]< nums2[j]){
                newArr[k] = nums1[i];
                i++;
            }else {
                
                newArr[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i<n) {
                newArr[k] = nums1[i];
            k++;
            i++;
            
        }
        while (j<m) {
            newArr[k] = nums2[j];
            k++;
            j++;

        }

        for(int num : newArr){
            System.out.println(num);
        }
        
    }
}