/**  
 *FruitLoops class extends Cereal super class and provides
 *methods to prepare, name, and price the cereal.
**/

//package csce247.assignments.factory;

public class FruitLoops extends Cereal{
	
	@Override
	public void prepare(){
		super.prepare();
		System.out.println("- Gather the grain");
		System.out.println("- Shape into circles");
		System.out.println("- Randomly color circles");
		System.out.println("- Let circles dry");
	}
	
	public FruitLoops() {
		name = "Fruit Loops";
		price = 1.89;
	}
}
