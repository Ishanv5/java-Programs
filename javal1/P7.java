// wajp to read length and breadth of rectangle 
// print area and perimeter of rectangle
// provid the data is valid 

class P7
{
public static void main(String args[])
{
double l = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
if (l>0 && b>0)
{
double area = l*b;
double perimeter = 2*(l+b);
System.out.println(" The area of the rectangle: "+area);
System.out.println(" The perimeter of the rectangle: "+perimeter);
}
else
{
System.out.println(" Invalid input ");
}
}
}