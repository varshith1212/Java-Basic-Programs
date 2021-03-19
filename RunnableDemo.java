import java.lang.*;

class RunnableDemo implements Runnable
{
 public void run()
 {
  try
  {
   for(int i=0; i<10 ;i++)
   {
    System.out.println("Hello "+i);
    Thread.sleep(1000);
   }
  }
  catch(InterruptedException e)
  {
   System.out.println("sleep is disturbed "+e);
  }
  System.out.println("execution is over");
 }
 public static void main(String[] args)
 {
  RunnableDemo rd = new RunnableDemo();
  Thread t = new Thread(rd);
  t.start();
 }
}