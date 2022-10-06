// wajp to find if the number is odd or even 

class EvenOdd
{
int num;

void setNum (int n)
{
num = n;
}

void check ()
{
String res = num % 2 == 0 ? "even" : "odd";
System.out.println(" The result "+ res);
}
}

class P13
{
public static void main(String args[])
{
int num = Integer.parseInt(args[0]);
EvenOdd eo = new EvenOdd();
eo.setNum(num);
eo.check();
}
}