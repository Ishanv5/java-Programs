// write a java program to read username and password if username=kamal and password =classes print success else failure
import java.io.*;
class P5{
public static void main(String args[]){
Console c=System.console();
String username=new String(c.readLine("Enter username : "));  // echo
String password=new String(c.readPassword("Enter password : "));  // readPassword-> console ke anader for password  ---non echo
if((username.equals("kamal")) && (password.equals("classes")))
System.out.println("Success ");
else
System.out.println("Failure ");
}
}