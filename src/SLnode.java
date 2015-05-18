
public class SLnode <E> {
	public SLnode next;
	public E data;
	
	public SLnode(E data){
		this.data = data;
		this.next = null;
	}
	
	public SLnode(E data, SLnode next){
		this.data = data;
		this.next = next;
	}
}
