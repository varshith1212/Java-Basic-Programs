class FA
{
 void show()
 {
  System.out.println("FA class show() method");
 }
 final void demo() ///demo() is a final method. it can't be overridden
 {
  System.out.println("FA class demo() method");
 }
}
class FB extends FA
{
 void show()
 { 
  System.out.println("FB class show() method");
 }
 /*void demo() 
   { 
     System.out.println("FB class demo() method"); 
   }*/
}
class FinalMethod
{
 public static void main(String args[])
 {
  FB b=new FB();
  b.show();
  b.demo();
 }
}
