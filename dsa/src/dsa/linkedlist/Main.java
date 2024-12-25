package dsa.linkedlist;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(2);
		linkedList.append(3);
		linkedList.prepend(1);
//		System.out.println(linkedList.removeFirst());
//		linkedList.getHead();
//		linkedList.getTail();
//		linkedList.getLength();
		linkedList.printList();
//		System.out.println("removeLast method: " + linkedList.removeLast().value);
//		linkedList.getHead();
//		linkedList.getTail();
//		System.out.println("get method: " + linkedList.get(0).value);
//		System.out.println("set method: " + linkedList.set(0, 5));
//		linkedList.getHead();
//		System.out.println("insert method: " + linkedList.insert(1, 8));
//		System.out.println("remove method: " + linkedList.remove(0).value);
//		linkedList.getLength();
		linkedList.reverse();
		System.out.println("-----------------------");
		linkedList.printList();
	}
}
