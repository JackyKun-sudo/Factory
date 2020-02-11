/**  
 *FrostedFlakes class extends Cereal super class and provides
 *methods to prepare, name, and price the cereal.
**/

//package csce247.assignments.factory;

public class FrostedFlakes extends Cereal{
	
	@Override
	public void prepare(){
		super.prepare();
		System.out.println("- Gather the grain");
		System.out.println("- Shape into flakes");
		System.out.println("- Sprinkle with frosting");
	}
	
	public FrostedFlakes() {
		name = "Frosted Flakes";
		price = 2.99;
	}
}
