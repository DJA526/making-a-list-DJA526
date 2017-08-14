
public class LinkedList implements LinkedListInterface{
	
	Node start = null;

	Node end = null;

	int size = 0;

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void addFirst(Object data) {
		Node first = new Node(data, start);
		Node temp = start;
		start = first;
		start.setNext(temp);
	}

	@Override
	public void addLast(Object data) {
		while (true) {
			Node n = start;
			if (n.getNext() == null) {
				
			}
		}
	}

	@Override
	public void add(Object data, int index) {
		
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

}
