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
public class revarray 
{
public static void main(String []Args)
{
    String a;
    char al[]=new char[100];
    Scanner s=new Scanner(System.in);
    System.out.println("enter the array:");
    a=s.nextLine();
    char d[]=a.toCharArray();
     int i=d.length-1;
     for(int j=0;j<d.length;j++)
    {
            al[j]=d[i];
        i--;       
    }  
     System.out.println(al);   
}
}
