// wajp to find if the given num is even or odd

class P3
{
public static void main(String args[])
{
int num = Integer.parseInt(args[0]);
String res = num % 2 == 0 ? "even" : "odd";
 System.out.println(res);
}
}