
public class Human {
	private String location = "Earth";
	

	public Human() {
		
	}
	
	public void toMars() {
		location = "Mars";
	}
	
	public void toEarth() {
		location = "Earth";
	}
	
	public String getLocation()
	{
		return location;
	}


}
