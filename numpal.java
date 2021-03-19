class numpal
{
 public static void main(String args[]) 
 {
   int num=Integer.parseInt(args[0]);
   int r=0,s=0;
   int n=num;
   while(n>0)
    {
      r=n%10;
      s=(s*10)+r;
      n=n/10;     
    }
   if(s==num)
     System.out.println("given number is palindrome");
   else
      System.out.println("given number is not palindrome");
 }    
}