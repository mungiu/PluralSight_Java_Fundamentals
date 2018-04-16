package Ex2001;

public class Van extends Car
{
	private int maxLoad;

	public Van(String owner, double price, String regNo, int maxLoad)
	{
		super(owner, price, regNo);
		this.maxLoad = maxLoad;
	}

	public int getMaxLoad()
	{
		return maxLoad;
	}

	public String toString()
	{
		return super.toString() + " " + maxLoad;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Van))
			return false;
		else
		{
			Van temp = (Van) obj;
			return super.equals(temp) && maxLoad == temp.maxLoad;
		}
	}
}
