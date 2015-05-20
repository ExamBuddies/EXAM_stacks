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
		if(isEmpty()){ // if empty could throw exception, here we just return null.
			return null;
		}
		else if(front == back){ // if front equals back, we have reached the final element in the queue. Set both front and back to -1 and return last value.
			E element = queue[front];
			front = -1;
			back = -1;
			return element;
		}
		else{
			E element = queue[front];
			front++;
			return element;
		}
	}

	@Override
	public void enqueue(E e) {
		if(back + 1 == size){ // if 70% or more of the array is used, resize it.
			resize();
		}
		if(isEmpty()){ // if queue is empty, increase both front and back to 0, and set index 0 equal to parameter.
			front++;
			back++;
			queue[back] = e;
		}
		else{
			back++;
			queue[back] = e;
		}
	}
	
	private void resize(){
		E[] oldArr = queue;
		size*=2;
		queue = (E[])new Object[size];
		for(int i = 0; i < oldArr.length; i++){
			queue[i] = oldArr[i];
		}
	}

	private boolean isEmpty(){
		return(front == -1 && back == -1);
	}
	
}
