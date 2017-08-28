
/*

 *  Java Program to Implement Singly Linked List

 */

/*  Class Node  */
class Node<T> {
	protected T data;
	protected Node<T> next;

	/* Constructor */
	public Node() {
		next = null;
		data = null;
	}

	/* Constructor */
	public Node(T data, Node<T> node) {
		this.data = data;
		next = node;
	}

	/* Function to set link to next Node */
	public void setNext(Node<T> node) {
		next = node;
	}

	/* Function to set data to current Node */
	public void setData(T data) {
		this.data = data;
	}

	/* Function to get link to next node */
	public Node<T> getNext() {
		return next;
	}

	/* Function to get data from current Node */
	public T getData() {
		return data;
	}
}
