class nprime
{
  public static void main(String args[])
  {
    //System.out.println("enter a number"); 
    int n=Integer.parseInt(args[0]);
    int i,j,count;
    //System.out.println("number is "+n);
    for(i=1;i<=n;i++)
    {
      count=0;
      for(j=2;j<i;j++)
      {
         if(i%j==0)
             count++;
      }
      if(count==0)
          System.out.println(" "+i);
    }
  }
}
