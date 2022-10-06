// write a java program to read the marks of n student and find sum and avg
import java.io.*;
class P3{
public static void main(String args[]){
Console c=System.console();
int n=Integer.parseInt(c.readLine("Enter n : "));
int marks[]=new int[n];
for(int i=0;i<marks.length;i++)
marks[i]=Integer.parseInt(c.readLine("Enter a marks : "));

int sum=0;
for(int i=0;i<n;i++){
sum=sum+marks[i];
}
System.out.println("Sum : "+ sum);
double avg=sum/n;
System.out.println("Avg : "+ avg);
}
}