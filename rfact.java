import java.io.*;
import java.lang.*;
class rfact
{
  int fact(int n)
  {
    if(n==1)
       return 1;
    else
       return (n*fact(n-1));   
  }
  public static void main(String args[]) 
  {
    int num=Integer.parseInt(args[0]);
    rfact f=new rfact();
    System.out.println("factorial of "+num+" is "+f.fact(num));    
  } 
}

/*
 public static void main(String args[]) throws Exception
  {
    BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
    int num=Integer.parseInt(d.readLine());
    rfact f=new rfact();
    System.out.println("factorial of "+num+" is "+f.fact(num));    
  } 
*/
