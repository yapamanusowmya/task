package task1;
import java.util.Scanner;

public class arm {
    public static void main(String args[])
{
int n, m, num=0, rem;
Scanner scan = new Scanner(System.in);
System.out.print("Enter any Positive Number : ");
n = scan.nextInt();
m= n;
while(m != 0)
{
rem = m%10;
num = num + rem*rem*rem;
m = m/10;
}
if(num == n)
{
System.out.print(n+" is an Armstrong Number");
}
else
{
System.out.print(n+"is Not an Armstrong Number");
}
}
    
}
