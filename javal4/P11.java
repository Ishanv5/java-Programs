// wajp to add two integers and also three integers
// we overload to add more features, more functionality
// while using static we don't need to make objects

class Compute
{
	public static void add(int n1, int n2)
	{
		int res = n1 + n2;
		System.out.println(" The result : " + res);
	}
	public static void add(int n1, int n2, int n3)
	{
		int res = n1 + n2 + n3;
		System.out.println(" The result : " + res);
	}
	public static void add(int n1, int n2, int n3, int n4)
	{
		int res = n1 + n2 + n3 + n4;
		System.out.println(" The result : " + res);
	}
}

class P11
{
	public static void main(String args[])
	{
		Compute.add(2, 4);
		Compute.add(2, 4, 4);
		Compute.add(2, 4, 4, 2);
	}
}