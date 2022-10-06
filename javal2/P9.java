// wajp to find maximum of three numbers 

class P9
{
public static void main(String args[])
{
double n1 = Double.parseDouble(args[0]);
double n2 = Double.parseDouble(args[1]);
double n3 = Double.parseDouble(args[2]);
System.out.println(" The three numbers: " + n1 + "  " + n2 + "  " + n3);
if ( (n1 > n2) && (n1 > n3) )
{
System.out.println(" The first number " + n1 + " is the maximum.");
}
else if ((n2 > n1) && (n2 > n3))
{
System.out.println(" The second number " + n2 + " is the maximum.");
}
else
{
System.out.println(" The third number " + n3 + " is the maximum.");
}
}
}