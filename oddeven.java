import java.io.*;
import java.util.*;
class oddeven
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
if(num%2==0 && num>0)
System.out.println("The number"+" "+num+" "+"is even");
else if(num%2!=0 && num>0)
System.out.println("The number"+" "+num+" "+"is odd");
else
System.out.println("The number"+" "+num+" "+"is negative");   
}
}
