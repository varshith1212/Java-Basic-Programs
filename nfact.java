class nfact
{
  public static void main(String args[])
  {
    int n=Integer.parseInt(args[0]);
    int i,fact=1;
    for(i=n;i>=1;i--)
    {
      fact=fact*i;
    }
    System.out.println("factorial of "+n+" is "+fact); 
  }
}