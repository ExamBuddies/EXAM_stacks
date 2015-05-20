package stacks;

public class StackArray <E> implements Stack<E>{
	
	// implementation of stack with array
	
	private E[] array; 
	private int top;
	
	public StackArray(){
		array = (E[])new Object[7];
		top=-1;
	}

	@Override
	public E pop() {
		if(top < 0){
//			throw new IndexOutOfBoundsException();
			return null;
		}
		E element = array[top];
		array[top] = null;
		top--;
		return element;
	}

	@Override
	public void push(E e) {
		if(top >= array.length -1){
			resize();
		}
		top++;
		array[top] = e;
	}
	
	private void resize(){
		E[] oldArr = array;
		array = (E[])new Object[array.length * 2];
		for(int i = 0; i < oldArr.length; i++){
			array[i] = oldArr[i];
		}
	}
}
