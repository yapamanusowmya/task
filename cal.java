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
public class cal {
    public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("1. ADD");
System.out.println("2. SUB");
System.out.println("3. MUL");
System.out.println("4. DIV");
System.out.println("Enter Choice : ");
int i=s.nextInt();
System.out.println("Enter 1st number:");
int a=s.nextInt();
System.out.println("Enter 2nd number :");
int b=s.nextInt();
double r=0;
switch(i)
{
case 1:
    r=a+b;
    System.out.println("result = "+r);
    break;
case 2:
    r=a-b;
    System.out.println("result = "+r);
    break;
case 3:
    r=a*b;
    System.out.println("result = "+r);
    break;
case 4:
    if(b==0)
    {
    System.out.println("Division not possible");
    break;
    }
    else
    r=a/b;
    System.out.println("result = "+r);
    break;
    default:
    System.out.println("End");
    }
    
}
}
