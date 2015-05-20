package stacks;

public class StackDemo {

	public static void main(String[] args) {
		StackArray<Integer> stackArr = new StackArray<Integer>();
		StackLinked<Integer> stackLinked = new StackLinked<Integer>();
		
		// Array implementation
		
		stackArr.push(1);
		stackArr.push(2);
		stackArr.push(3);
		stackArr.push(4);
		stackArr.push(5);
		
		System.out.println(stackArr.pop());
		System.out.println(stackArr.pop());
		System.out.println(stackArr.pop());
		System.out.println(stackArr.pop());
		System.out.println(stackArr.pop());
		System.out.println(stackArr.pop());
		
		// Linked list implementation
//		
//		stackLinked.push(1);
//		stackLinked.push(2);
//		stackLinked.push(3);
//		stackLinked.push(4);
//		stackLinked.push(5);
//		
//		System.out.println(stackLinked.pop());
//		System.out.println(stackLinked.pop());
//		System.out.println(stackLinked.pop());
//		System.out.println(stackLinked.pop());
//		System.out.println(stackLinked.pop());
//		System.out.println(stackLinked.pop());
	}

}
