
import java.util.ArrayList;

/*Write a simulation program for the fruit market. 
 * The farmer will be able to produce different types of fruits (apple, orange, grape, and water-melon)
 * Put them in the market to sell. 
 * The market has limited capacity and farmers have to stand in a queue if the capacity is exceeded to sell their fruits. 
 * Consumers can come to the market any time and purchase their desired fruits
 * If the fruits they want to buy runs out, they are willing to wait until the supply of that kind is ready. 
 */

// TODO marketStorage <--- user input this  
// TODO Fruit will be represented by a string 
// TODO Market class that have two kind of methods 
// the farmer method that get a fruit and the customer that take the fruit 

class Market {
	private ArrayList<String> fruits = new ArrayList<>();
	private int fruitsNumber;

	// make a constructor to get set the fruit number on initializing the market
	public Market(int fruitsNumber) {
		if (fruitsNumber > 0) {
			this.fruitsNumber = fruitsNumber;
		} else {
			throw new IllegalArgumentException("This argument is not valid");
		}
	} // end of the constructor

	// check if their is no place or its full //
	private synchronized boolean isFull() {
		return fruits.size() == this.fruitsNumber;
	}

	private synchronized boolean isEmpty() {
		return fruits.isEmpty();
	}

	// consumer and producer methods // the main program //
	public synchronized void farmer(String fruit) {
		if (isFull()) {
			System.out
					.println("We can not accept more fruites at the moment !!");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interruption");
			}
		}
		fruits.add(fruit);
		System.out.printf("fruit : %s is added !!!%n", fruit);
	}

	public synchronized String consumer() {

		if (isEmpty()) {
			System.out.println("we don't have any goods yet");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("interruption occure !!!");
			}
		}
		
		String currentFruitRecusted = fruits.remove(0);
		notifyAll();
		return currentFruitRecusted;
	}

}

public class Main {
	public static void main(String[] args) {
		Market superMarket = new Market(10);
		
		
		
	}
}