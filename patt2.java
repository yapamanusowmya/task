package Arrays;
import java.util.Scanner;

public class patt2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");         
        int r = sc.nextInt();
        for (int i = 1; i<= r; i++)
        {
            for (int j = r; j >= i; j-- )
            {
                System.out.print(j+"");
            }
             
            System.out.println();
        }
        sc.close();
    }
}
