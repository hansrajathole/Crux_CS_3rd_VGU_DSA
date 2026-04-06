public class String_Demo{
    public static void main(String []args){
        String str1 = "ankit";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("ankita");

        // System.out.println(str1 == str2);  // Compare Address
        // System.out.println(str3 == str4); // Compare Address
        // System.out.println(str3 == str2); // Compare Address
        // int arr[] =  new int[5];
        // System.out.println(arr.toString());
        // System.out.println(str1.length());

        // System.out.println(str1);

        // System.out.println(str1.equals(str2)); // Compare Value
        // System.out.println(str3.equals(str4)); // Compare Value

        // System.out.println(equals(str1, str2));
        // System.out.println(equals(str3, str4));
        System.out.println(str1.compareTo(str4)); //-ve ---> str1<str2  +ve ---->str1>str4   0 str1 == str2 
        System.out.println(compareTo(str1, str4));
    }

    public static boolean equals(String str1 , String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        int n = str1.length();
        for(int i = 0 ; i<n ; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static int compareTo(String str1 , String str2){
        int n = Math.min(str1.length(), str2.length());
        int ans = 0;
        for(int i = 0 ; i<n ; i++){
           if(str1.charAt(i)<str2.charAt(i)){
            return str1.charAt(i)-str2.charAt(i);
           }
           else if(str1.charAt(i)>str2.charAt(i)){
            return str1.charAt(i)-str2.charAt(i);
           }
        }

        return str1.charAt(str1.length())-str2.charAt(str2.length()-1);
    }

}