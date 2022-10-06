// wajp to read radius from the user and print area and circumference

class P6
{
public static void main(String args[])
{
double r = Double.parseDouble(args[0]);
if(r > 0.0)
{
final double Pi = 3.14;
double area = Pi*r*r;
double circumference = 2*Pi*r;
System.out.println(" The circumference of the circle: "+circumference);
System.out.println(" The area of the circle: "+area);
}
else
{
System.out.println(" Invalid Input ");
}
}
}