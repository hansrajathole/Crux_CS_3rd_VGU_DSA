package Lec8;
import java.util.*;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int age ;
        String name ;
        char fav ;

        System.out.print("Enter your Age : ");
        age = input.nextInt();
        System.out.print("Enter your name : ");
        name = input.next();
        System.out.print("Enter your Fav Char : ");
        fav = input.next().charAt(0);

        System.out.println("your age is "+age +" and your name is : "+name +" and your fav char is : "+fav);

        

    }
}
