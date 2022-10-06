// wajp to read the year and print if its a leap year 

class P2
{
public static void main(String args[])
{
int year = Integer.parseInt(args[0]);
if (year < 0)
{
System.out.println(" Invalid input ");
}
else if (year % 4 == 0)
{
System.out.println(" It is a leap year. ");
}
else 
{
System.out.println(" It is not a leap year. ");
}
}
}