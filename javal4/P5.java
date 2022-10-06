// wajp to find if the given num is even or odd

import java.util.*;
class P5
{
public static void main(String args[]) 
{
Scanner s = new Scanner(System.in);
System.out.println(" Enter Integer ");
int num = s.nextInt();
String res = num % 2 == 0 ? "even" : "odd";
 System.out.println(res);
}
}