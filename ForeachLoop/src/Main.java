import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		String[] animals = {"Cat", "Dog", "Rat", "Bird"};
		
		for(String item: animals) {
			
			System.out.println(item);
			
		}
		
		System.out.println();
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("HotDog");
		food.add("Hamburger");
		
		for(String item: food) {
			
			System.out.println(item);
			
		}

	}

}
