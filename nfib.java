//non recursive fibanocci series
class nfib
{
 public static void main(String args[])
 { 
   int n=Integer.parseInt(args[0]);
   int i,a=0,b=1,c;
   System.out.print("fibanocci series is 0 1");
   for(i=3;i<=n;i++)
   {
     c=a+b;
     System.out.print(" "+c);
     //System.out.println(i+"th fib series"+c);
     a=b;
     b=c; 
   } 
 }
}