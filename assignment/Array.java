import java.lang.*;
import java.util.Scanner;
class Array
{
  public void DuplicateElements(int a[],int n)  // duplicate array elements
  {
     System.out.println("duplicate elements are:");
     for(int i=0;i<n;i++) //duplicate array elements 
     {
       for(int j=i+1;j<n;j++)    
          if(a[i]==a[j])
          {
             System.out.println(a[i]+" ");
             break;
          }
     }   
  }
  public void  SecondLargestElement(int a[],int n)  
  {
     int temp;
     for(int i=0;i<n;i++)
           for(int j=i+1;j<n;j++)
           {
              if(a[i]>a[j])
              {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;                
              } 
           }
     System.out.println("Second largest element is "+a[n-2]);    
  } 
  public static void main(String args[])
  { 
    Scanner s=new Scanner(System.in); 
    System.out.print("enter no.of elements:"); 
    int n=s.nextInt();
    int a[]=new int[n];
    System.out.print("Enter array elements:");
    for(int i=0;i<n;i++)//read array elements
         a[i]=s.nextInt();
    Array a1=new Array();
    a1.DuplicateElements(a,n);
    a1.SecondLargestElement(a,n);
  }
}