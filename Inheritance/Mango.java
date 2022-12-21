package Inheritance;

public class Mango extends Fruit{
	public static void main(String[] args) {
		Mango m=new Mango();
		m.quantity=10;
		m.price=200;
		m.color="yellow";
		System.out.println("color= "+m.color);
		System.out.println("price= "+m.price);
		System.out.println("Quantity= "+m.quantity);
		m.preparefruitsalad();
		m.MilkShake();
	}

}
