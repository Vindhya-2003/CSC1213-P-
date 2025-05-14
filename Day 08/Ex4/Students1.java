class Student{
	int id;
	String name; 
	public Student(int x,String y){ 
	this.id=x;
	this.name=y;
	}
}
class Students1{
	public static void main(String[] args)
	{
		Student s1=new Student(101,"Vindhya");
		
		
		System.out.println(s1.id+""+s1.name);
	}
}