// wajp to find the factorial using while

class P10
{
public static void main(String args[])
{
int num = Integer.parseInt(args[0]);
if (num >= 0)
{
int i = 1; 
double fact = 1;
while ( i <= num )
{
fact = fact * i;
i++;
}
System.out.println(" The factorial: "+ fact);
}
else
{
System.out.println(" Invalid Input ");
}
}
}