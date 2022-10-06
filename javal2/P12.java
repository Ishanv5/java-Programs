// wajp to read the marks and print the grade 
// marks > 80 --> A
// marks > 60 --> B
// marks > 40 --> C
// else D

class P12 
{
public static void main(String args[])
{
int marks = Integer.parseInt(args[0]);
if (marks <= 0 || marks > 100)
System.out.println(" Invalid input ");
else if (marks >= 80)
System.out.println(" Your grade is A ");
else if (marks >= 60)
System.out.println(" Your grade is B ");
else if (marks >= 40)
System.out.println(" Your grade is C ");
else
System.out.println(" Your grade is D ");
}
}