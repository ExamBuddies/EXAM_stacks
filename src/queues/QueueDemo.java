package queues;

public class QueueDemo {
	public static void main(String[] args){
		QueueArray<Integer> queueArray = new QueueArray<Integer>();
		QueueLinked<Integer> queueLinked = new QueueLinked<Integer>();
		
		// Array implementation
		
		queueArray.enqueue(1);
		queueArray.enqueue(2);
		queueArray.enqueue(3);
		
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.dequeue());
		queueArray.enqueue(1);
		queueArray.enqueue(2);
		queueArray.enqueue(3);
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.dequeue());	
		
		// Linked list implementation
		
//		queueLinked.enqueue(1);
//		queueLinked.enqueue(2);
//		queueLinked.enqueue(3);
//		
//		System.out.println(queueLinked.dequeue());
//		System.out.println(queueLinked.dequeue());
//		System.out.println(queueLinked.dequeue());
//		System.out.println(queueLinked.dequeue());
//		System.out.println(queueLinked.dequeue());
//		queueLinked.enqueue(1);
//		queueLinked.enqueue(2);
//		queueLinked.enqueue(3);
//		System.out.println(queueLinked.dequeue());
//		System.out.println(queueLinked.dequeue());
//		System.out.println(queueLinked.dequeue());		
		
	}
}
