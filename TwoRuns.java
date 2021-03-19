import java.lang.*;
class FirstThread extends Thread
{
public void run()
{
try
{
for(int i=1;i<=10;i++)
System.out.println("FIRST THREAD"+i);
Thread.sleep(2000);
}
catch(InterruptedException e1)
{
System.out.println("FIRST THREAD IS DISTURBED"+e1);
}
System.out.println("FIRST THREAD IS OVER");
}
}
class SecondThread extends Thread
{
public void run()
{
try
{
for(int i=11;i<=20;i++)
System.out.println("SECOND THREAD"+i);
Thread.sleep(1000);
}
catch(InterruptedException e2)
{
System.out.println("SECOND THREAD IS DISTURBED"+e2);
}
System.out.println("SECOND THREAD IS OVER");
}
} 

class TwoRuns
{
public static void main(String args[])
{
FirstThread ft=new FirstThread();
SecondThread st=new SecondThread();
ft.start();
st.start();
try
{
ft.join();
st.join();
}
catch(InterruptedException e3)
{
System.out.println("MAIN THREAD DISTURBED"+e3);
}
 }
}