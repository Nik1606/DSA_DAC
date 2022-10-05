
public class Animals {
	private static String animal;
	
	public Animals()
	{
		animal="XXX";
	}
	
	public Animals(String s)
	{
		this.animal=s;
	}
	
	public static void setAnimal(String s)
	{
		animal=s;
	}
	
	public String getAnimal()
	{
		return animal;
	}
	
	public String toString()
	{
		String str= " Animal name is: "+animal+" ";
		return str;
	}
}
