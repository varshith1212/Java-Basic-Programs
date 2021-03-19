import java.lang.*;
class SThisDemo
{
int x,y,z;
SThisDemo(int x,int y,int z)
{
this.x=x;
this.y=y;
this.z=z;
}
void display()
{
System.out.println("x="+x+"y="+y+"z="+z);
}
public static void main(String args[])
{
System.out.println("use of this keyword");
SThisDemo d=new SThisDemo(10,20,30);
display();
}
}