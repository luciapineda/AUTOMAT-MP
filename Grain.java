
class Grain {
	private String location = "Earth";
	

	public Grain() {
		
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
