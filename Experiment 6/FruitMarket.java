import java.util.ArrayList;
class Market {
	private ArrayList<String> fruits = new ArrayList<>();
	private int fruitsNumber;

	public Market(int fruitsNumber) {
		if (fruitsNumber > 0) {
			this.fruitsNumber = fruitsNumber;
		} else {
			throw new IllegalArgumentException("This argument is not valid");
		}
    }
    
	private synchronized boolean isFull() {
		return fruits.size() == this.fruitsNumber;
	}

	private synchronized boolean isEmpty() {
		return fruits.isEmpty();
	}

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

public class FruitMarket {
	public static void main(String[] args) {
		Market superMarket = new Market(10);	
	}
}