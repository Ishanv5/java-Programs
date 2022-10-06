// write a java program to read a string and count number of letter and nos of digits
import java.io.*;
class P6{
public static void main(String args[]){
Console c=System.console();
String str=new String(c.readLine("Enter a string : "));
char ch[]=str.toCharArray();
int lc=0,dc=0;
for(char d:ch){
if(Character.isLetter(d)) lc++;
 else if(Character.isDigit(d)) dc++;

}
System.out.println("Letter count : " + lc);
System.out.println("Digit count : " + dc);
}
}