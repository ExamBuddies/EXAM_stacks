
public class StackDemo {

	public static void main(String[] args) {
		StackArray<Integer> stackArr = new StackArray<Integer>();
		
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
	}

}
