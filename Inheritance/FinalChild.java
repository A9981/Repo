package Inheritance;

final public class FinalChild extends FinalClass{

	public static void main(String[] args) {
		FinalChild fc=new FinalChild();
		fc.details("white");
		System.out.println(fc.name);
		System.out.println(fc.color);
		System.out.println(fc.price);
	}

}
