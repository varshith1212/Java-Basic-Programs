class StaticMeth
{
int htno; //non static variable
String studentname; //non static variable
static String collegename="JNTU"; // static variable
StaticMeth(int h,String sn) // 2 parameter constructor
{
htno=h;
studentname=sn;
}
void display() // non static method
{
System.out.println("HT No:"+htno+ " Student name"+studentname+ " College name " + collegename);
}
static void change() //static method
{
collegename="MREC"; //we can access static content (static var or static method)
}
public static void main(String args[])
{
StaticMeth s1=new StaticMeth(501," xyz"); //s1 is an object
StaticMeth s2=new StaticMeth(502," abc");//s2 is an object
StaticMeth s3=new StaticMeth(503," pqr");//s3 is an object
s1.display(); s2.display(); s3.display();
StaticMeth.change(); //static method is called with class name
System.out.println("After calling static method change() ");
s1.display(); s2.display(); s3.display();
}
}