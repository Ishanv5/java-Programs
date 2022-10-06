// wajp to read two integers and find the minimum of two 


class P7
{
public static void main(String args[])
{
int n1 = Integer.parseInt(args[0]);
int n2 = Integer.parseInt(args[1]);
System.out.println(" The two numbers: " + n1 + "  " + n2);
if ( n1 > n2 )
{
System.out.println(" The second number " + n2 + " is minimum. ");
}
else
{
System.out.println(" The first number " + n1 + " is minimum. ");
}
}
}

// Single statement in if() {} are not necessary.
// {} known as block of statements.