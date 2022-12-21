package Inheritance;

public class Car extends Vehicle {
	public static void main(String[] args) {
		Car c=new Car();
		c.name="Skoda";
		c.price=500000;
		System.out.println(c.name+"\n"+c.price);
		c.StartEngine();
		c.StopEngine();
		}

}
