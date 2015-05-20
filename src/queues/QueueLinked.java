package queues;

public class QueueLinked <E> implements Queue <E>{
	
	// Linked list implementation of queue
	
	private QLnode front, back; // Noeds at the front and back of queue
	
	public QueueLinked(){
		front = null;
		back = null;
	}

	@Override
	public E dequeue() {
		
		if(front == null){ // if empty, return null.
			return null;
		}
		if(front == back){ // if front equals back, we have reached last element in queue, set front and back to null and return last value.
			QLnode frontNode = front;
			front = null;
			back = null;
			return (E)frontNode.data;
		}
		else{ // else return front nodes data.
			QLnode frontNode = front;
			front = frontNode.previous;
			return (E)frontNode.data;
		}
	}

	@Override
	public void enqueue(E data) {
		if(front == null && back == null){ // if queue is empty before adding, set new node as front and back.
			QLnode newNode = new QLnode(data);
			front = newNode;
			back  = newNode;
		}
		else{ // else set .previous for current back to the new element, and set it to back.
			QLnode newNode = new QLnode(data);
			back.previous = newNode;
			back = newNode;
		}
	}

}
