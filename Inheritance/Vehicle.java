package Inheritance;

public class Vehicle {
	String name;
	int price;
	void StartEngine() {
		System.out.println(this);
		System.out.println("Start-Engine");
	}
	void StopEngine() {
		System.out.println("Stop-Engine");
	}
}
