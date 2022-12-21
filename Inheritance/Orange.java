package Inheritance;

public class Orange extends Fruit {

	public static void main(String[] args) {
		Orange o=new Orange();
		o.quantity=20;
		o.price=400;
		o.color="orange";
		System.err.println("color= "+o.color);// err used to change output data color.
		System.err.println("price= "+o.price);
		System.err.println("Quantity= "+o.quantity);
		o.preparefruitsalad();
		o.MilkShake();
	}
}