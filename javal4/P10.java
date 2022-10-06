// wajp to add two integers and also three integers
// we overload to add more features, more functionality

class Compute
{
	public void add(int n1, int n2)
	{
		int res = n1 + n2;
		System.out.println(" The result : " + res);
	}
	public void add(int n1, int n2, int n3)
	{
		int res = n1 + n2 + n3;
		System.out.println(" The result : " + res);
	}
	public void add(int n1, int n2, int n3, int n4)
	{
		int res = n1 + n2 + n3 + n4;
		System.out.println(" The result : " + res);
	}
}

class P10
{
	public static void main(String args[])
	{
		Compute c = new Compute();
		c.add(2, 4);
		c.add(2, 4, 4);
		c.add(2, 4, 4, 2);
	}
}