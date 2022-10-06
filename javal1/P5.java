// wajp to find sum of three numbers and find their average

class P5 
{
public static void main(String args[])
{
double n1 = Double.parseDouble(args[0]);
double n2 = Double.parseDouble(args[1]);
double n3 = Double.parseDouble(args[2]);
double sum = n1 + n2 + n3;
double avg = sum/3;
System.out.println(" The sum of the three numbers: "+sum);
System.out.println(" Their average: "+avg);
System.out.printf("The average: %.4f", avg); //use printf for formatting 
}
}