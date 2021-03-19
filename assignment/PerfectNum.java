import java.lang.*;
import java.util.Scanner;
class PerfectNum
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number to check if it's perfect number:");
    int n=s.nextInt();   //int n=Integer.parseInt(args[0]);
    int sum=0;
    for(int i=1;i<n;i++)
    { 
      if(n%i==0)     
        sum=sum+i;     
    }
    if(n==sum)
       System.out.println(n+" is a perfect number");
    else
       System.out.println(n+" is not a perfect number");  
  }
}