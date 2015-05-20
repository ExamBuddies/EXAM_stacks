package queues;

public class QLnode <E>{
	public E data;
	public QLnode previous;
	
	public QLnode(E data){
		this(data,null);
	}

	public QLnode(E data, QLnode previous) {
		this.data = data;
		this.previous = previous;
	}
	
}
