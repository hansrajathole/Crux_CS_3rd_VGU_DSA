package Lec14;

public class Fun_Demo2 {

    static int x= 23;
    static int y = 50;
    public static void main(String[] args) {
        System.out.println("Hello");
       System.out.println(x+y);
        Add();
        System.out.println("Bye");
    }

    public static void Add(){
        int x = 40;
        int y = 30;
        Sub();
        System.out.println(x+y);

    }

    public static void Sub(){
        int x = 10;
        int y = 30;
        System.out.println(x-y);
    }

}
