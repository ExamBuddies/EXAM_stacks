package queues;

public class QueueLinked <E> implements Queue <E>{
	private QLnode front, back;
	
	public QueueLinked(){
		front = null;
		back = null;
	}

	@Override
	public E dequeue() {
		if(front == null){
			return null;
		}
		else{
			E data = (E)front.data;
			front = front.previous;
			return data;
		}
	}

	@Override
	public void enqueue(E data) {
		if(front == null && back == null){
			QLnode newNode = new QLnode(data);
			front = newNode;
			back  = newNode;
		}
		else{
			QLnode newNode = new QLnode(data);
			back.previous = newNode;
			back = newNode;
		}
	}

}
