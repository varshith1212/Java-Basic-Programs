class SA
{
 int x=10;
}
class SuperKeyvar extends SA
{
 int x=30;
 public void show()
 {
  System.out.println("x value in B class: "+x);
  System.out.println("x value in A class: "+super.x);
  System.out.println("x+super.x value is"+(x+super.x));
 }
 public static void main(String args[])
 {
  SuperKeyvar obj=new SuperKeyvar();
  obj.show();
 }
}
