public class Laxicographic {
    public static void main(String[] args) {
        String str1 = "Ankit";
        String str2 = "Anketaa";

        System.out.println(str1.compareTo(str2));
        System.out.println(compareTo(str1, str2));

    }

    public static int compareTo(String s1 , String s2) {
        if (s1 == s2) {
            return 0;
        }
        int n = Math.min(s1.length(), s2.length());

        for(int i = 0 ; i<n ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i)- s2.charAt(i);
            }
        }


        return s1.length() - s2.length();


    }
}
