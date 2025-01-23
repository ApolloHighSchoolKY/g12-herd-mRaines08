//� A+ Computer Science
// www.apluscompsci.com

//ArrayList of User-defined Classes


public class Creature
{
	private int size;

	public Creature(int girth) {
		size=girth;
	}

	public void setSize(int girth)
	{
		size=girth;
	}

	public int getSize()
	{
		return size;
	}

	/*
	 * method isBig should return true if size > 75
	 * method isBig should return false if size <= 75
	*/
	public boolean isBig()
	{
		return size > 75;
	}

	public boolean equals(Object obj)
	{
		Creature other = (Creature)obj;
		return size == other.getSize();
	}

	public int compareTo(Object obj)
	{
		return size - ((Creature)obj).getSize();
	}

	public String toString() 
	{
		return "" + size;
	}
}