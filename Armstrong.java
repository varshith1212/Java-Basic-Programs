//Check whether a given no is an Amstrong number or not...  

//A number is said to be Armstrong if sum of cube of every digit is equal to the number itself.

//import math.java
class Armstrong
{
  public static void main(String args[])
  {
    int number = Integer.parseInt(args[0]);
    int remainder = 0, sum=0; 
    int n=number;
    while(n>0)
    {
       remainder=n%10;
       sum=sum+(remainder*remainder*remainder);
       n=n/10;
    }
    if(sum==number)
       System.out.println("Given number is Armstrong number");
    else
       System.out.println("Given number is not an Armstrong number");
  }
}
