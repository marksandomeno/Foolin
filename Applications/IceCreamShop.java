
public class IceCreamShop {
	
	//looping through enum values
	enum Flavor {vanilla, chocolate, mint};
	
	

	
	public static void main(String args[]) {
		
		System.out.println("Welcome to the Ice Cream Shop, We have...");
		
		for(Flavor f: Flavor.values()) {
			
			
			System.out.println(f);
			
			
		}
		
		
		
	}

	public IceCreamShop() {
		// TODO Auto-generated constructor stub
	}

}
