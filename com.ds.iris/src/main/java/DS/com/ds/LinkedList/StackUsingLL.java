package DS.com.ds.LinkedList;

class MyLinkedList<T> {
	static class Node<T> {
		T data;
		Node next;

		Node(final T data, final Node next) {
			this.data = data;
			this.next = next;
		}
	}

	Node head;

	public void addFirst(final T data) {
		final Node newNode = new Node(data, null);
		if (head != null) {
			newNode.next = head;
		}
		head = newNode;
	}

	public T getFirst() {
		if (head == null) {
			System.out.println("Satck is empty");
			return null;
		} else {
			final T local = (T) head.data;
			head = head.next;
			return local;
		}
	}

	@Override
	public String toString() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		return "";
	}
}

class MyStack<T> {

	MyLinkedList<T> linkedList = new MyLinkedList<T>();

	public boolean isEmpty() {
		if (linkedList.head == null) {
			return true;
		} else {
			return false;
		}
	}

	public T pop() {
		final T local = linkedList.getFirst();
		System.out.println(local);
		return local;
	}

	public void push(final T data) {
		linkedList.addFirst(data);
	}

	@Override
	public String toString() {
		return "" + linkedList + "";
	}

}

public class StackUsingLL<T> {

	public static void main(final String[] args) {
		final MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		stack.pop();
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
}
