
public class StackLinked <E> implements Stack<E>{
	
	private SLnode<E> top;
	
	public StackLinked(){
		top = new SLnode<E>(null);
	}

	@Override
	public E pop() {
		SLnode<E> topNode = top;
		top = topNode.next;
		topNode.next = null;
		return topNode.data;
	}

	@Override
	public void push(E item) {
		SLnode<E> nextNode = top;
		top = new SLnode<E>(item,nextNode);
	}

}
