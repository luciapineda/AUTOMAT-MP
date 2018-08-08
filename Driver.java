/***** PINEDA, Lucia Corazon L.
       SAYSON, Joey *****/

public class Driver {
	public static void main(String args[])
	{	
		Lion lion = new Lion();
		Cow cow = new Cow();
		Grain grain = new Grain();
		Human human1 = new Human();
		Human human2 = new Human();
		Decider decider = new Decider();
		
		System.out.println("Location of Lion is: " + lion.getLocation());
		System.out.println("Location of Cow is: " + cow.getLocation());
		System.out.println("Location of Grain is: " + grain.getLocation());
		System.out.println("Location of Human1 is: " + human1.getLocation());
		System.out.println("Location of Human2 is: " + human2.getLocation());
		
		lion.toMars();
		cow.toMars();
		
		if(decider.decide(lion, cow, grain, human1, human2))
		{
			System.out.println("No one has eaten anyone yet.");
		}
		else
		{
			System.out.println("Uh oh someone has eaten someone...");
		}
		
		System.out.println("AFTER 1ST TRANSPORT: ");
		
		System.out.println("Location of Lion is: " + lion.getLocation());
		System.out.println("Location of Cow is: " + cow.getLocation());
		System.out.println("Location of Grain is: " + grain.getLocation());
		System.out.println("Location of Human1 is: " + human1.getLocation());
		System.out.println("Location of Human2 is: " + human2.getLocation());
	}
}
