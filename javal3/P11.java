// wajp to find the factorial of a given integer using do while

class P11
{
public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
if (n >= 0)
{
int i = 1;
int fact = 1;
do 
{
fact = fact * i;
i++;
}while( i <= n);
System.out.println(" The factorial: "+fact);
}
else
{
System.out.println(" Invalid Input ");
}
}
}