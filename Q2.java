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
public class Q2 
{
   
    public static void main(String[]args)
    {
      int dis = 0,up,nu,amt;
      double disamt,rev;
      Scanner in=new Scanner(System.in);
      System.out.print("Enter the unit prize:");
      up=in.nextInt();
      System.out.print("\nEnter the quantity of the units:");
      nu=in.nextInt();
      amt=nu*up;
      if((nu>=100)&&(nu<=120))
      {
          dis=10;
         
      }
      else if(nu>120)
      {
          dis=15;
      }
      else if(nu<100)
      {
          dis=0;
      }
      disamt=(dis/100)*amt;
      rev=(nu*up)-disamt;
      System.out.println("discount:"+dis);
      System.out.println("After discount:"+disamt);
      System.out.println("\nThe revenue from sale:"+rev);
      
     }  
}
