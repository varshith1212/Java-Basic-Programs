class DefCon
{
 int a,b,c;
 DefCon()
 {
 System.out.println("Default Constructor");
 a=50;
 b=20;
 System.out.println("a value="+a + " b value="+ b);
 }

 void add()
 {
 c=a+b;
System.out.println("Addition of a and b is" + c);
 }
 void sub()
 {
 c=a-b;
System.out.println("Subtraction of a and b is" + c);
 }
 public static void main(String[] args)
 {
 DefCon d=new DefCon();
 d.add();
 d.sub();
 }
}