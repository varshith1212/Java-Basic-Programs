//recursive fibanocci series
class rfib
{
 int fib(int n)
 {
   if(n==0 || n==1)
      return 1;
   else
      return(fib(n-1)+fib(n-2)); 
 }
 public static void main(String args[])
 {
   int n=Integer.parseInt(args[0]);
   rfib f=new rfib();
   System.out.print("fibanocci series is 0 1 ");
   for(int i=3;i<=n;i++)
       System.out.print(f.fib(i-2)+" ");
 }
}