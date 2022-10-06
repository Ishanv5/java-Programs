// write a java program to read the marks of n student and find lowest and highest mark
import java.util.*;
import java.io.*;
class P4{
public static void main(String args[]){
Console c=System.console();
int n=Integer.parseInt(c.readLine("Enter n : "));
int marks[]=new int[n];
for(int i=0;i<n;i++)
marks[i]=Integer.parseInt(c.readLine("Enter a marks : "));
Arrays.sort(marks);
int min=marks[0];
int max=marks[marks.length-1];
System.out.println(max);
System.out.println(min);
}
}