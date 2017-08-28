
public class LinkedList<T> implements LinkedListInterface<T>{
	
	private Node<T> start = null;

	private Node<T> end = null;

	int size = 0;

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void addFirst(T data) {
		if (isEmpty()) {
			start = end = new Node<T>(data, start);	
		} else {
			start = new Node<T>(data, start);
		}
		size++;
	}

	@Override
	public void addLast(T data) {
		if (isEmpty()) {
			start = end = new Node<T>(data, end);
		} else {
			Node<T> newEnd = new Node<T>(data, null);
			end.setNext(newEnd);
			end = newEnd;
		}
		size++;
	}

	@Override
	public void add(T data, int index) {
		Node<T> n = start;
		for (int i = 0; i < index - 1; i++) {
			n = n.getNext();
		}
		Node<T> add = new Node<T>(data, n.getNext().getNext());
		n.getNext().setNext(add);
		size++;
	}

	@Override
	public void remove(int index) {
		Node<T> n = start;
		for (int i = 0; i < index - 1; i++) {
			n = n.getNext();
		}
		n.setNext(n.getNext().getNext());
		size--;
	}
	
	public String toString() {
		String s = "";
		Node<T> n = start;
		while (n != null) {
			s += n.getData().toString();
			n = n.getNext();
		}
		return s;
	}

}
