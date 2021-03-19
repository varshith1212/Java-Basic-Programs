class MCatch
{
 public static void main(String args[])
 {
  System.out.println("Before Multiple catch");
  try
  {
   //StringBuffer sb=new StringBuffer("Java"); //length of string is 4
   //System.out.println("value at 9th position in the string " + sb.charAt(9));
   int x=10,y=0,z;
   z=x/y;
   System.out.println("z value:"+z);
   int a[]={10,20,30};
   System.out.println("a[7] vlue is:"+a[7]);
  }
  catch(ArithmeticException e1)
  {
   System.out.println("divide by 0 is not possible "+e1);
  }
  catch(ArrayIndexOutOfBoundsException e2)
  {
   System.out.println("cannot access array element "+e2);
  }
  catch(NumberFormatException e3)
  {
   System.out.println("cannot access number format "+e3);
  }
  System.out.println("After Multiple catch");
 }
}
