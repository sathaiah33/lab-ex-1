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
public class Q3 
{
    public static void main(String[]args)
    {
      int a,r,i,n,c;
      c=0;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the value of n");
      n=in.nextInt();
      for(i=1;i<=n;i++)
      {
        a=i;
        while(a!=0)
        {
         r=a%10;
         a=a/10;
         if(r==5)
         {
           c++;
           break;
         }
        }
      }
      System.out.println("numbers containing digit 5 :"+c);
    }
    
}
