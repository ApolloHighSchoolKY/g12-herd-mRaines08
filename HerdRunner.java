//� A+ Computer Science
// www.apluscompsci.com

//ArrayList of User-defined Classes

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class HerdRunner
{
	public static void main ( String[] args )
	{
		Creature dog = new Creature(25);
		Creature horse = new Creature(900);

		System.out.println("The dog's size is " + dog);
		System.out.println("The horse's size is " + horse);

		System.out.println("\nIs the dog big? " + dog.isBig());
		System.out.println("Is the horse big? " + horse.isBig());

		System.out.println("\nIs dog equal to horse? " + dog.equals(horse));
		System.out.println("What is the size difference? " + dog.compareTo(horse));

		System.out.println("");

		Herd bunch = new Herd();
		bunch.add(73);
		bunch.add(75);
		bunch.add(76);
		bunch.add(900);
		bunch.add(10);
		bunch.add(55);
		bunch.add(1100);
		System.out.println("Bunch has creatures sizes" + bunch);
		System.out.println("There are " + bunch.countBigOnes() + " big creatures.");
  }
}