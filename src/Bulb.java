
public class Bulb
{
	/**
	 * The default power of the bulbs.
	 */
	private static final int DEFAULT_POWER = 100;
	/**
	 * The chosen power of the bulb.
	 */
	private final int power;
	/**
	 * the state of the bulb (lit/not-lit).
	 */
	private boolean islit;
	/**
	 * The state of the bulb (burnt/not-burnt).
	 */
	private boolean isburnt;
	
	/**
	 * Creates a not-lit and not-burnt bulb with default power.
	 */
	public Bulb()
	{
		this.power = Bulb.DEFAULT_POWER;
		this.islit = false;
		this.isburnt = false;
	}
	/** Creates a not-lit and not-burnt bulb with a chosen power.
	 * @param powerValue The power of the bulb.
	 */
	public Bulb(int powerValue)
	{
		this.power = powerValue;
		this.islit = false;
		this.isburnt = false;
	}
	
	/** Creates a not-lit bulb with default power and with chosen state (burnt/not-burnt).
	 * @param burntValue The state of the bulb (burnt/not-burnt).
	 */
	public Bulb(boolean burntValue)
	{
		this.power = Bulb.DEFAULT_POWER;
		this.islit = false;
		this.isburnt = burntValue;
	}
	/** Creates a not-lit bulb with chosen power and chosen state (burnt/not-burnt).
	 * @param powerValue 
	 * @param burntValue
	 */
	public Bulb(int powerValue, boolean burntValue)
	{
		this.power = powerValue;
		this.islit = false;
		this.isburnt = burntValue;
	}
	
	public void switchOn()
	{
		this.islit = true;
	}
	public void switchOff()
	{
		this.islit = false;
	}
	
	public int getPower()
	{
		return this.power;
	}
	
	public boolean islit()
	{
		return this.islit;
	}
	
	public boolean isburnt()
	{
		return this.isburnt;
	}
}
