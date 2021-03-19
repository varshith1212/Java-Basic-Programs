import java.util.Scanner;
import java.math.*;
class quad
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("enter a coefficient:");
    float a=s.nextFloat();
    System.out.print("enter b coefficient:");
    float b=s.nextFloat();
    System.out.print("enter c coefficient:");
    float c=s.nextFloat();
    double d=(double)((b*b)-(4*a*c));
    double x=(double)(((-b)+Math.sqrt(d))/(2*a));
    double y=(double)(((-b)-Math.sqrt(d))/(2*a));
    if(d<0)
       System.out.println("there are no real solutions");
    else
       System.out.println("Roots of quadratic equations"+ x+"and"+ y);
  }
}

