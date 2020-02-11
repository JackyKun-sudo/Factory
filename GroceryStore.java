/**
 *csce240
 *02/11/20
 *Jackson Gaulke  
 *GroceryStore class takes in String and returns Cereal methods depending
 *on cereal entered 
**/

//package csce247.assignments.factory;

public class GroceryStore {
	
	public Cereal createCereal(String type) {
		if(type.equals("frosted flakes")) {
			return new FrostedFlakes();
		}else if(type.equals("fruit loops")) {
			return new FruitLoops();
		}else if(type.equals("lucky charms")) {
			return new LuckyCharms();
		}
		return null;
	}
	
	public Cereal orderCereal(String type) {
		Cereal cereal = createCereal(type);
		
		cereal.prepare();
		cereal.boxCereal();
		cereal.priceCereal();
		
		return cereal;
	}
	
}