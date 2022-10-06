// wajp to take the radius and print its area and circumference

class P5
{
public static void main(String args[])
{
double r = Double.parseDouble(args[0]);
if ( r > 0.0 )
{
final double PI = 3.14;
double area = PI * r * r;
double circumference = 2 * PI * r;
System.out.println(" Area of the cirle: "+area);
System.out.println(" Circumference of the circle: "+circumference);
}
else
{
System.out.println(" Invalid input ");
}
}
}