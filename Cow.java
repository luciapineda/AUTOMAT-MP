
public class Cow {
	private String location = "Earth";
	

	public Cow() {
		
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
