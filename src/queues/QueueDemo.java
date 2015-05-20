package queues;

public class QueueDemo {
	public static void main(String[] args){
		QueueLinked<Integer> queueLinked = new QueueLinked<Integer>();
		
		queueLinked.enqueue(1);
		queueLinked.enqueue(2);
		queueLinked.enqueue(3);
		
		System.out.println(queueLinked.dequeue());
		System.out.println(queueLinked.dequeue());
		System.out.println(queueLinked.dequeue());
	}
}
