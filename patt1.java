/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.Scanner;

/**
 *
 * @author ciprus
 */
public class patt1 {
    public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number of rows to be printed: ");

int r = sc.nextInt();
for (int i = 1; i<= r  ; i++)
{
for (int j = 1; j<= i; j++)
{
System.out.print(j+" ");
}

System.out.println();
}

//Close the resources

sc.close();
}

}
