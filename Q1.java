/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;
import java.util.Scanner;
/**
 *
 * @author sathaiah balaji
 */
public class Q1
{
    
    public static void main(String[]args)
    {
      int a,b,c;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the values of a and b");
      a=in.nextInt();
      b=in.nextInt();
      c=(a<b)? a:b;
      System.out.println("Minimum number:"+c);
     }
}
