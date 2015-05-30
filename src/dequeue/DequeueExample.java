import java.util.Deque;
import java.util.LinkedList;


public class DequeueExample {

	public static void main(String[] args) {
		Deque<String> deck = new LinkedList<>();


		deck.add("Hej");
		deck.add("mit");

		deck.push("test");
		deck.addFirst("test2");


		deck.add("navn");
		deck.add("er");

		deck.push("Kek");

		deck.addLast("Bullermand"); 


		System.out.println(deck);

		//exception
		System.out.println("First value: " + deck.getFirst());
		System.out.println("Last value: " + deck.getLast());

		System.out.println("\n\n\n");



		while (!deck.isEmpty()) {
			System.out.println(deck.remove()); // removefirst/last() 
		}


		System.out.println(deck.poll());
		System.out.println(deck.pollFirst());
		System.out.println(deck.pollLast());

		//		System.out.println(deck.removeFirst());


		System.out.println();

		System.out.println(deck);

	}

}
