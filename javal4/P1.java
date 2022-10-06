/* waoojp for class Student 
 variable   rno, name, marks
 methods    setData(), showData(), findGrade()
		m > 80 -> A
		m > 60 -> B
		else -> C 
*/

class Student 
{
	// var  or states 

	private int rno;
	private String name;
	private int marks;

	// methods or behaviour
	public void setData(int r, String n, int m)
	{
 		rno = r;
		name = n;
 		marks = m;
	}
        public void showData()
  	{
 		System.out.println(" The roll number : " + rno);
 		System.out.println(" The name : " + name);
		System.out.println(" The marks : " + marks);
   	}
   	public void findGrade()
   	{
	 	if (marks > 80)
	 	{
		 	System.out.println(" Your Grade is A ");
	 	} 
 		else if(marks > 60)
		{
 			System.out.println(" YOur Grade is B ");
		}
		else
		{
			 System.out.println(" Your Grade is C ");
		}
	}

}

class P1
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		int rno = Integer.parseInt(args[0]);
		String name = args[1];
		int marks = Integer.parseInt(args[2]);
		s1.setData(rno, name, marks);
		s1.showData(); 
		s1.findGrade();	
	}
}