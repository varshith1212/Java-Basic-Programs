import java.util.Scanner;
import java.lang.*;
class Stringpal
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    String s=scan.nextLine();
    int c=0;
    char a[]=s.toCharArray();
    for(int i=0,j=a.length-1;i<=j;i++,j--)
    {
      if(a[i]!=a[j])
      {
        c++;
        break;
      }    
    } 
    if(c==0)
       System.out.println("pal");
    else
       System.out.println("not a pal");
  }
}