class SC1 //super class
{
 SC1(int x,int y) // super class constructor
 {
  System.out.println("Super class x value="+x);
  System.out.println("Super class y value="+y);
 }
}
class SC2 extends SC1//SC2 is the subclass of SC1
{
 SC2(int x,int y,int z) // Sub class constructor
 {
  super(x,y); //it will call automatically super class constructor
  System.out.println("Sub class x value="+x);//x belongs to sub class
  System.out.println("Sub class y value="+y);//y belongs to sub class
  System.out.println("Sub class z value="+z);//z belongs to sub class
  //1.The super keyword must be the first statement in the subclass constructor to call super class constructor
  //2. We can't write more than one super keyword in the subclass constructor
  //3. We can't use combination of this and super keyword in this.
 }
}

class SuperKeyCon
{
 public static void main(String args[])
 {
  SC2 t=new SC2(10,20,30); //object for the sub class then it automatically call sub class constructor
 }
}
