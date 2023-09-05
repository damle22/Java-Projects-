
public class Node<T> {
	private T item;
	private Node<T> next;
	
	public Node(T item) {
		super();
		this.item = item;
	}
	
	public T get() {
		return item;
	}
	
	public Node<T> next() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public boolean equals(Node<T> n) {
		if(n == null) return false;
		return (n.get().equals(get()));
	}
	
	public static <VAL> Node<VAL> create(VAL item) {
		return new Node<VAL>(item);
	}
	
}
