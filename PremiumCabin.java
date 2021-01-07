/**
 * PremiumCabin.java Premium Cabin that offers the same services as the standard cabin plus 1 extra amenity and service
 * @author SrivatsanTalkad
 *
 */
public class PremiumCabin extends StandardCabin 
{
	// 1 extra amenity for premium cabin
	private int cabinExtraCapacity;
	
	/**
	 * Default Constructor set cabinCapacity to 1
	 */
	public PremiumCabin() 
	{
		super();
		cabinExtraCapacity = 1;
	}

	/**
	 * Delivers entertainment to the premium cabin
	 */
	public void cabinEntertainment() 
	{
	
	}
	
	/**
	 * Cleans cabin more frequently
	 */
	@Override
	public void cabinCleaning() 
	{
				System.out.println("Premium Cabin is cleaned more frequently");
	}

	int getCabinExtraCapacity()
	{
		return cabinExtraCapacity;
	}
}