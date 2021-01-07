/**
 * StandardCabin.java Standard Cabin that offer 3 amenities and 2 services
 * @author SrivatsanTalkad
 *
 */
public class StandardCabin 
{
	// 3 amenities of the StandardCabin
	private int numberOfCabinWindows;
	private boolean cabinAirConditioning;
	private boolean cabinHeating;
	
	/**
	 * Default constructor method constructs 3 amenities that are set to 0 and false respectively
	 */
	public StandardCabin() 
	{
		numberOfCabinWindows = 0;
		cabinAirConditioning = false;
		cabinHeating = false;
	}
	
	/**
	 * Constructor method that constructs 3 amenities
	 * @param numberOfCabinWindows the number of cabin windows
	 * @param cabinAirConditioning whether there is air conditioning present
	 * @param cabinHeating whether there is heating present
	 */
	public StandardCabin(String amenity1, String amenity2, String amenity3) 
	{
		this.numberOfCabinWindows = numberOfCabinWindows;
		this.cabinAirConditioning = cabinAirConditioning;
		this.cabinHeating = cabinHeating;
	}
	
	/**
	 * Cleans cabin less frequently
	 */
	public void cabinCleaning() 
	{
		System.out.println("Standard Cabin is cleaned less frequently");
	}
	
	/**
	 * Delivers food to cabin
	 * @param food
	 * @return
	 */
	public String cabinDeliverFood(String food) 
	{
		return food;
	}
	
	/**
	 * Delivers other to cabin
	 * @param other
	 * @return
	 */
	public String cabinDeliverOther(String other) 
	{
		return other;
	}
}