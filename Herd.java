//� A+ Computer Science
// www.apluscompsci.com

//ArrayList of User-defined Classes

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Herd
{
	private List<Creature> list;

	public Herd()
	{
		//point list a new ArrayList
		list = new ArrayList<Creature>();

	}

	public void add(int creatureSize)
	{
		//add a new Creature to the list
		list.add(new Creature(creatureSize));
	}

	/* method countBigOnes should return the count of
	    big creatures - use the isBig() Creature method
	*/
	public int countBigOnes()
	{
		int count = 0;

		for(Creature feature : list)
			if(feature.isBig())
				count++;

		return count;
	}

	public String toString()
	{
		return "" + list;
	}
}