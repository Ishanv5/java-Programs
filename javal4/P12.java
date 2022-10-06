// ...  variable arguments
// for  for each loop

class Compute
{
	public static void add(int ... n)
	{
		int res = 0;
		for (int d : n)
		res = res + d;
		System.out.println(" The result : " + res);
	}
}

class P12
{
	public static void main(String args[])
	{
		Compute.add(2,6);
		Compute.add(2,45,1);
		Compute.add(2,67,84,3,4,6,4);
	}
}