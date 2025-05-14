public class Car1{
	String brand;
	static int year;
	
	public Car1(String x, int y){
		this.brand = x;
		this.year = y;
	}
	
	static int getAge(int currentYear){
		return (currentYear - year);
	}
	
	/*static void displayInfo(String b, int y){
		System.out.println("Brand: " + b);
		System.out.println("Year: " + y);
	 }*/
	 
	 public static void main(String[] args){
		/*displayInfo("Toyota", 2020);
		
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		c1.displayInfo("Audi", 2018);
		c2.displayInfo("BMW", 2022);*/
		
		Car1 c3 = new Car1("Toyota", 2021);
		
		int age = c3.getAge(2025);
		System.out.println("My " + c3.brand + " is " + age + " years old");
	 }
}