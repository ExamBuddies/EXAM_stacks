package queues;

public class QueueLinked {
	private QLnode front, back;
	private int size;
	
	public QueueLinked(){
		front = null;
		back = null;
		size = 0;
	}
}
