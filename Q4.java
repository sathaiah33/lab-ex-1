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
public class Q4
{
    public static void main(String[]args)
    {
      int i,n;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the value of n");
      n=in.nextInt();
      for(i=1;i<=n;i++)
      {
      System.out.print(" "+i);    
      }
    }
}
