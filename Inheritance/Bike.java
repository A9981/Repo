package Inheritan

public class Bike extends Vehicle {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.name="dream yuga";
		b.price=100000;
		System.out.println(b.name+"\n"+b.price);
		b.StartEngine();
		b.StopEngine();
		

	}

}
