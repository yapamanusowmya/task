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
public class patt3 {
    public static void main(String args[])
 {
  int k,j,i;
  Scanner s=new Scanner(System.in);
  System.out.println("enter number of rows to be printed: ");
    int r = s.nextInt();
  
  for(i=1;i<=r;i++)                    
  {
   for(k=r-i;k>0;k--)   
    System.out.print(" ");
   for(j=2*i-1;j>0;j--)               
    System.out.print("*");
   System.out.println();
  }
  for(i=r-1;i>=0;i--)                    
  {
   for(k=0;k<r-i;k++)   
    System.out.print(" ");
   for(j=0;j<2*i-1;j++)               
    System.out.print("*");
   System.out.println();
  }
 }

}
