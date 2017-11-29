package task1;

public class fiba {
  public static void main(String args[]){ 
   int n1, n2;
   
n1=1;
n2=1;
for(int i=n1; n2<=200; i++) {
   System.out.print( n1+","+ n2+",");
   n1+=n2;
   n2+=n1;
}
  
  }  
}
