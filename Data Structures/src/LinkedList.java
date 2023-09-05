
public class LinkedList<T> {
	private Node<T> head = null;
	
	public void add(int i, Node<T> item) {
		//We don't want to let people add nodes that are 
		//already parts of lists. This can lead to loops!
		//If we catch it here, it can't slip through
		item.setNext(null);
		
		//If head was null, ignore the index and just
		//make the passed node the new head
		if(head == null) {
			head = item;
			return;
		}
		
		//We're gonna have to consider the node before 
		//where we're adding, but we don't have that
		//if we're adding in the first spot, so we
		//define this as a special case.
		if(i == 0) {
			item.setNext(head);
			head = item;
			return;
		}
		
		//What do we do for a bad index? 
		//Maybe we add it at the end.
		int step = 1;
		Node<T> prev = head;
		Node<T> current = head.next();
		while(current != null && step <= i) {
			if(step==i) {
				item.setNext(prev.next());
				break;
			}
			step++;
			prev = current;
			current = current.next();
		}
		//If we are at the right spot, item
		//will point to prev.next() already.
		//If we got to the end, this will
		//add it to the end nicely
		prev.setNext(item);
	}
	
	public void addFront(Node<T> item) {
		add(0, item);
	}
	
	//Delete all or just the first?
	//Traditionally, we just delete the
	//first that we find
	public void delete(Node<T> item) {
		//If the list is empty, stop
		if(head == null) return;
		
		//If it was the first item,
		//remove it and stop
		if(head.equals(item)) {
			head = head.next();
			return;
		}
		
		Node<T> prev = head;
		Node<T> current = head.next();
		
		while(current != null) {
			if(item.equals(current)) {
				prev.setNext(current.next());
				return;
			}
			prev = current;
			current = current.next();
		}
	}
	
	public String toString() {
		if(head == null) return "EMPTY LIST!!!";
		StringBuilder sb = new StringBuilder();
		sb.append(head.get());
		
		Node<T> current = head.next();
		while(current != null) {
			sb.append(" " + current.get());
			current = current.next();
		}
		
		return sb.toString();
	}
	
}
