class ThisMethod
{
 ThisMethod()
 {
  this(10);
  System.out.println("Default constructor");
 }
 ThisMethod (int x)
 {
  this(x,x+1);
  System.out.println("One parameter constructor"+x);
 }
 ThisMethod (int x,int y)
 {
  System.out.println("x value"+x+"y value"+y);
 }
 public static void main(String args[])
 {
  ThisMethod t=new ThisMethod ();
  System.out.println("this() method");
 }
}
