class prime
{
  public static void main(String args[])
  {
    //System.out.println("enter a number:");
    int n=Integer.parseInt(args[0]); 
    int i,count=0;
    //System.out.println("number is "+n);
    for(i=2;i<(n/2);i++)
    {
      if(n%i==0)
           count++;
     }
     if(count==0)
        System.out.println(n+" is prime number");
     else
        System.out.println(n+" not a prime number");
  }
}