// wajp to read the user's age and determine if the user can vote or not 

class P11
{
public static void main(String args[])
{
double age = Double.parseDouble(args[0]);
if ( age > 18.0)
{
System.out.println(" Your age: " + age);
System.out.println(" You are eligible to vote. "); 
}
else
{
System.out.println(" You are not eligible to vote. ");
}
}
}