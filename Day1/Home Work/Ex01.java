class Ex01
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		//Unary Operators
		System.out.println("Unary Operators:");
		System.out.println("a++:"+(a++));
		System.out.println("++b:"+(++b));
		
		//Logical Operators
		boolean x=true;
		boolean y=false;
		System.out.println("/nLogical Operators:");
		System.out.println("x &&y:"+(x &&y));
		System.out.println("x||y:"+(x||y));
		
		//Relationl Operators
		System.out.println("\nRelational Operators");
		System.out.println("a==b:"+(a==b));
		
		//Assignment Operators
		a+=5;
		System.out.println("\nAssignment Operators:");
		System.out.println("a+=5:"+a);
		
		//Ternary OPerator
		System.out.println("\nTernary Operator:");
		int result=(a>b)?a:b;
		System.out.println("result:"+result);
	}
}