// wajp to welcome the user

class P1 
{
public static void main(String args[])
{
if (args.length > 0)
{
String name = args[0];
String msg = "Welcome " + name;
System.out.println(msg);
}
else 
{
System.out.println(" Name not specified ");
}
}
}