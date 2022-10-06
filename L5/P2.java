/* write a oojp for class Employee
var id,name,salary
method const,tostring()
computetax   sal>40k->20%  , else 10%
Array of Employee -> Console
 */
import java.io.*;
class Employee{
private int id;
private String name;
private double sal;
private static String cn="KCS";
public Employee(int id,String name,double sal){
  this.id=id;
  this.name=name;
  this.sal=sal;
}
public String toString(){
  return id + " " + name+" "+sal+" " +cn;
}
public void ComputeTaxes(){
double ta;
if(sal>40000)
ta=sal*0.2;
else
ta=sal*0.1;

System.out.println(ta);
}
}
class P2{
public static void main(String args[]){
 Console c=System.console();
int n=Integer.parseInt(c.readLine("Enter nos of Employee : "));
if(n<=0){
System.out.println("Invalid nos ");
return;   // control go back
}
// creating a array of n obj
Employee e[]=new Employee[n];
// 
for(int i=0;i<n;i++){
int id=Integer.parseInt(c.readLine("Enter id : "));
String name=c.readLine("Enter a name : ");
double sal=Double.parseDouble(c.readLine("Enter ur salary : "));
e[i]=new Employee(id,name,sal);
}
for(int i=0;i<n;i++){    // instead of n we can use e.length 
System.out.println(e[i]);
e[i].ComputeTaxes();
}
}
}