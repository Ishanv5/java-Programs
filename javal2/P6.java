// wajp to read the length and breadth of the rectangle and print area and perimeter

class P6
{
public static void main(String args[])
{
double l = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
if ( (l > 0.0) && (b > 0.0) )
{
double area = l * b;
double perimeter = 2*(l + b);
System.out.println(" The area: "+ area);
System.out.println(" The perimeter: "+ perimeter);
}
else 
{
System.out.println(" Invalid input ");
}
}
}