class Finalval
{
 public static void main(String args[]) 
 {
  int a=10;
  System.out.println("value of a is:"+a);
  a=30;
  System.out.println("value of a is:"+a);
  final int b=50;
  System.out.println("value of b is:"+b);
  //b=60; //***GIVES ERROR***
  //System.out.println("value of b is:"+b);
 }
}