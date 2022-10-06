/* waoojp for class Employee
      var 	id, name, address, salary
      method	setEmployee(), showEmployee(), computeTax()  	
*/

class Employee
{
	// var 
	private int id;
	private String name;
	private String address;
	private double salary;

	// methods
	public void setEmployee(int i, String n, String a, double s)
	{
		id = i;
		name = n;
		address = a;
		salary = s;
	}
	public void showEmployee()
	{
		System.out.println(" The employee ID : " + id);
		System.out.println(" The name of the Employee : " + name);
		System.out.println(" The address of the Employee : " + address);
		System.out.println(" The salary of the Employee : " + salary);
 	}
	public void computeTax()
	{
		double tax = 0.0;
		if (salary > 20000)
			tax = salary * 0.20;
		else
	 		tax = salary * 0.10;	
		System.out.println(" The tax to be paid : " + tax);
	}
}

class P2
{
	public static void main(String args[])
	{
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		String address = args[2];
		double salary = Double.parseDouble(args[3]);
		Employee e = new Employee();
		e.setEmployee(id, name, address, salary);
		e.showEmployee();
		e.computeTax();
	}
}