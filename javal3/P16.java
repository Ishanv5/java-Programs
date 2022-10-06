/* waoojp for class Student 
var/state ==> rno, name, marks
method/behavior ==> setData(), showData()
*/

class Student 
{
int rno;
String name;
double marks;

void setData(int r, String n, double m)
{
rno = r;
name = n;
marks = m;
}

void showData()
{
System.out.println(" The roll no.: "+ rno);
System.out.println(" The name: "+name);
System.out.println(" The marks: "+marks);
}
}

class P16
{
public static void main(String args[])
{
Student s1 = new Student ();
s1.setData(10, "Prashi", 86);
s1.showData();
}
} 