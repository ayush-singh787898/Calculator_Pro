import java.util.Scanner;

public class Substraction {
   public Substraction() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter first Number");
      int var2 = var1.nextInt();
      System.out.println("Enter Second Number");
      int var3 = var1.nextInt();
      System.out.println("Enter the character");
      char var4 = var1.next().charAt(0);
      if (var4 == '-') {
         System.out.println( (var2 - var3));
      }

   }
}
