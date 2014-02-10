
public class Bulb
{
	private static final int DEFAULT_POWER = 100;
	private final int power;
	private boolean islit;
	private boolean isburnt;
	
	public Bulb()
	{
		this.power = Bulb.DEFAULT_POWER;
		this.islit = false;
		this.isburnt = false;
	}
	public Bulb(int powerValue)
	{
		this.power = powerValue;
		this.islit = false;
		this.isburnt = false;
	}
	
	public Bulb(boolean burntValue)
	{
		this.power = Bulb.DEFAULT_POWER;
		this.islit = false;
		this.isburnt = burntValue;
	}
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
