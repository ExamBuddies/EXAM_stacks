package queues;

public class QueueArray <E> implements Queue <E>{
	// Implementation of queue with array.
	private E[] queue;
	private int front;
	private int back;
	private int size;
	
	public QueueArray(){
		front = -1; // empty
		back = -1; // empty
		size = 17; // set initial size to 17
		queue = (E[])new Object[size];
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		
	}
	
}
