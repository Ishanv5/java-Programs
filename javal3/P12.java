// wajp to check if given number is odd or even

class P12
{
public static void main(String args[])
{
int num = Integer.parseInt(args[0]);
String res = num % 2 == 0 ? "even" : "odd";
System.out.println(" Result "+res);
}
}