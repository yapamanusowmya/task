package Arrays;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number:");
       int n = scanner.nextInt();
       int r = fact(n);
       System.out.println("The factorial of " + n + "is " + r);
   }          
   public static int fact(int n) {
       int r= 1;
       for (int i = 1; i<= n; i++) {
           r= r *i;
       }
       return r;
   }

}
