class ThisKeyword
{
 int x;
 void show(int x)
 {
  x=x;
 }
  void display(int x) {
  this.x=x;
 }
 public static void main(String args[])
 {
  ThisKeyword t1=new ThisKeyword();
  t1.show(50);
  System.out.println("show() t1 value:"+t1.x);
  t1.display(10);
  System.out.println("display() t1 value:"+t1.x);
 }
} 