class P10
{
public static void main(String args[])
{
double n1 = Double.parseDouble(args[0]);
double n2 = Double.parseDouble(args[1]);
double n3 = Double.parseDouble(args[2]);
System.out.println(" The three numbers: " + n1 + "  " + n2 + "  " + n3);
System.out.println(" The maximum number: " + Math.max(Math.max(n1 , n2) , n3));
}
}