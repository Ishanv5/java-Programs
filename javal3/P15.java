// wajp to find the sum of two numbers

class Add		//encapuslation
{
double num1, num2;

void setData(double n1, double n2)
{
num1 = n1;
num2 = n2;
}

void compute ()
{
double res = num1 + num2;
System.out.println(" The sum: "+res);
}
}


class P15
{
public static void main(String args[])
{
double n1 = Double.parseDouble(args[0]);
double n2 = Double.parseDouble(args[1]);
Add a = new Add();	//instantion
a.setData(n1, n2);
a.compute();
}
}