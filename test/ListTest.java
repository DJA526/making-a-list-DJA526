import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest {

	@Test
	public void testNewLinkedList() {
		LinkedList<String> singly = new LinkedList<String>();
		assertTrue(singly.isEmpty()); // linked list should be empty
		assertEquals(0, singly.size()); // length of linked list should be zero
	}
	
	@Test
	public void testAddLast() {
		LinkedList<String> singly = new LinkedList<String>();
		singly.addLast("ABC");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals(1, singly.size()); // length of linked list should be 1
	}
	

	@Test
	public void testAddMultiple() {
		LinkedList<String> singly = new LinkedList<String>();
		singly.addLast("You ");
		singly.addLast("are ");
		singly.addLast("awesome!!");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals(3, singly.size()); // length of linked list should be 3
	}
	
	@Test
	public void testToString() {
		LinkedList<String> singly = new LinkedList<String>();
		singly.addLast("You ");
		singly.addLast("are ");
		singly.addLast("awesome!!");
		assertEquals("You are awesome!!", singly.toString());
	}
	
	@Test
	public void testAdd() {
		LinkedList<String> singly = new LinkedList<String>();
		singly.addLast("You ");
		singly.addLast("are ");
		singly.addLast("awesome!!");
		singly.add("really ", 1);
		assertEquals("You are really awesome!!", singly.toString()); 
	}
	
	@Test
	public void testRemove() {
		LinkedList<String> singly = new LinkedList<String>();
		singly.addLast("You ");
		singly.addLast("are ");
		singly.addLast("really ");
		singly.addLast("awesome!!");
		singly.remove(2);
		assertEquals("You are awesome!!", singly.toString());
	}

}
