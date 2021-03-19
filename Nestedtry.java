class Nestedtry
{
public static void main(String args[])
{
System.out.println("Nested Try");
try //outer try block
{
int x=args.length;
System.out.println("x value is:"+x);
int y=2/x;
System.out.println("y value:"+y);
try //inner try followed by their corresponding catch block
{
if(x==1) x=x/(x-1);
if(x==2)
{
int arr[]={10};
System.out.println("arr[2] value:"+arr[x]);
}
}//inner try block
catch(ArithmeticException e1) //for inner try block
{
System.out.println("divide by 0 is not possible"+e1);
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("cannot access element");
}
}//end of outer try block
catch(ArithmeticException e3)
{
System.out.println("divide by 0 is not possible"+e3);
}
System.out.println("Hello");
}
} 