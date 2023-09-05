

public class Driver {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println(list);
		
		list.addFront(Node.create(10));
		list.addFront(Node.create(86));
		list.addFront(Node.create(92));
		list.addFront(Node.create(14)); // delete this one
		list.addFront(Node.create(31));
		list.addFront(Node.create(45));
		System.out.println(list);	
		
		list.add(3, Node.create(74));
		System.out.println(list);
		
		list.delete(Node.create(14));
		System.out.println(list);
		
	}

}
