/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class larray {
    public static void main(String[] Arg)
    {
        Scanner s=new Scanner(System.in);
    String a;
  String b;
  System.out.println("enter the 1st array:");
    a=s.nextLine();
      System.out.println("enter the 2st array:");
   b=s.nextLine();
    
  char c[]=a.toCharArray();
   int d=c.length; 
    //System.out.println(d=c.length);
    
    char e[]=b.toCharArray();
    int g=e.length;
    
    
    if(d>g)
    {
        System.out.println("The longest string is: "+a);
    }
    else
    {
    System.out.println("The longest string is: "+b);
    }
    }
    
    
}
