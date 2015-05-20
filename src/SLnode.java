
public class SLnode <E> {
	// node for linked list implementation of stack
	
	public SLnode next;
	public E data;
	
	public SLnode(E data){
		this(data,null);
	}
	
	public SLnode(E data, SLnode next){
		this.data = data;
		this.next = next;
	}
}
