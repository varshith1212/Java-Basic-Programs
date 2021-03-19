import java.lang.*;
import java.util.Scanner;
class StringPalindrome
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the string:");
    String s1=s.nextLine();
    char arr[]=s1.toCharArray();
    int flag=0;
    //System.out.println(arr.length);
    for(int i=0,j=arr.length-1;i<=j;i++,j--) 
       if(arr[i]!=arr[j])
       {
         flag=1;
         break;  
       }
    if(flag==0)
       System.out.println(s1+" is palindrome");
    else
       System.out.println(s1+" is not palindrome");         
  }
}