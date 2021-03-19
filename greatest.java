import java.lang.*;
import java.util.Scanner;
class greatest
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("enter first number: ");
    int a=s.nextInt();
    System.out.print("enter second number: ");
    int b=s.nextInt();
    System.out.print("enter third number: ");
    int c=s.nextInt();
    if(a>b)
       if(a>c)
          System.out.println(a+" is the greatest");
       else
          System.out.println(c+" is the greatest"); 
    else
       if(b>c)
          System.out.println(b+" is the greatest");
       else
          System.out.println(c+" is the greatest");         
  }
}