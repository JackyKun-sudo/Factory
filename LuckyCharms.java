/**  
 *LuckyCharms class extends Cereal super class and provides
 *methods to prepare, name, and price the cereal.
**/

//package csce247.assignments.factory;

public class LuckyCharms extends Cereal{
	
	@Override
	public void prepare(){
		System.out.println("- Gather the grain");
		System.out.println("- Shape into circles");
		System.out.println("- Create marshmellow shapes");
		System.out.println("- Mix circles and marshmellows");
	}
	
	public LuckyCharms() {
		name = "Lucky Charms";
		price = 1.55;
	}
}