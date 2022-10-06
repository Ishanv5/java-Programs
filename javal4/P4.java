// wajp to find if the given num is even or odd

import java.io.*;
class P4
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println(" Enter Integer ");
int num = Integer.parseInt(br.readLine());
String res = num % 2 == 0 ? "even" : "odd";
 System.out.println(res);
}
}