// wajp to read three numbers and print their sum and average 

class P4
{
public static void main(String args[])
{
double n1 = Double.parseDouble(args[0]);
double n2 = Double.parseDouble(args[1]);
double n3 = Double.parseDouble(args[2]);
double sum = n1 + n2 + n3;
double avg = sum/3;
System.out.println(" The sum: "+ sum);
System.out.println(" The average: "+avg);
}
}