// write a java program to read ussername and password if username=kamal and password =classes
// print sucess else failure
import java.io.*;
class P1{
public static void main(String args[]){
Console c=System.console();
String username=new String(c.readLine("Enter username :"));
String password=new String(c.readPassword("Enter password :"));  // readPassword -> concole class 
if((username.equals("kamal") && (password.equals("classes")))) // we cannot see what are we write
System.out.println("Success");
else
System.out.println("Failure");
}
}
// In java string has equals methods which check the data ...