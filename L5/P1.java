/* write a oojp for class Student
var rno,name,marks
method const,tostring()
find grade m>80 -> A , ..m>60-> B.. else -> c
Array of student -> scanner
 */
import java.util.*;
class Student{
private int rno;
private String name;
private int marks;
private static String pn="Kamal sir";
public Student(int rno,String name,int marks){
  this.rno=rno;
  this.name=name;
  this.marks=marks;
}
public String toString(){
  return rno + " " + name+" "+marks+" " +pn;
}
void findGrade(){

if(marks>80)
System.out.println("A");
else if(marks>60)
System.out.println("B");
else
System.out.println("C");
}
}
class P1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n : ");
int n=sc.nextInt();
Student s[]=new Student[n];
for(int i=0;i<n;i++){
System.out.println("Enter rno : ");
int rno=sc.nextInt();
System.out.println("Enter name : ");
String name=sc.next();
System.out.println("Enter marks : ");
int marks=sc.nextInt();
s[i]=new Student(rno,name,marks);

}
for(int i=0;i<n;i++){
System.out.println(s[i]);
s[i].findGrade();
}
}
}