/**  
 *Cereal class contains variables name and price to retrieve
 *the name and price of the cereal entered. Also returns string notifying
 *that the cereal is being prepared.  
**/

//package csce247.assignments.factory;

public class Cereal {
	
	protected String name;
	protected double price;
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void prepare() {
		System.out.println("Preparing the " + name);
	}
	
	public void boxCereal() {
		System.out.println("Putting fun pictures of " + name +
				" on a box\n" + "Pouring the " + name + " into the box");
	}
	
	public void priceCereal() {
		System.out.println("Putting price tags of $" + price + " on the " + name + " box");
	}
}
