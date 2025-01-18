import java.util.*;
public class Multiplication {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int x=sc.nextInt();
        System.out.println("Enter Second Number");

        int y=sc.nextInt();
        System.out.println("Enter the character");

        char ch=sc.next().charAt(0);
        if(ch=='*'){
            System.out.println((x*y));
        }
    }
    
}

