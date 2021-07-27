/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author rakesh
 */
public class Q5 
{
    public static void main(String[]args)
    {
      int i,n,sum1,sum2;
      int[] a;
      sum1=0;
      sum2=0;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the no of elements");
      n=in.nextInt();
      a=new int[10];
      for(i=1;i<=n;i++)
      {
      System.out.print("Enter the value of element"); 
      a[i]=in.nextInt();
      }
      System.out.print("Elements in the array:");
      for(i=1;i<=n;i++)
      {
      System.out.print(" "+a[i]);
      }
      for(i=1;i<=n;i++)
      {
       if((a[i]%2)==0)
       {
        sum1=sum1+a[i];   
       }
       else
       {
         sum2=sum2+a[i];   
       }
      }
      System.out.println("Sum of even numbers:"+sum1);
      System.out.println("Sum of odd numbers:"+sum2);
    }
}
