package queues;

public interface Queue <E> {
	public E dequeue();
	public void enqueue(E e);
}
