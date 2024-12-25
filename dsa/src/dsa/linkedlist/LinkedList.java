package dsa.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	long length;

	public LinkedList(long value) {
		Node node = new Node(value);
		head = node;
		tail = node;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}

	}

	public void getHead() {
		System.out.println("Head: " + head.value);
	}

	public void getTail() {
		System.out.println("Tail: " + tail.value);
	}

	public void getLength() {
		System.out.println("Length: " + length);
	}

	public void append(long value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public void prepend(long value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0)
			return null;
		Node temp = head;
		Node pre = head;
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;

		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) {
			tail = null;
			head = null;
		}
		return temp;
	}

	public Node removeFirst() {
		if (length == 0)
			return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		Node temp = head;
		if (index < 0 || index >= length)
			return null;
		for (int i = 0; i < index; i++) {
			temp = head.next;

		}
		return temp;
	}

	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int value) {
		if (index < 0 || index > length)
			return false;
		if (index == 0) {
			prepend(index);
			return true;
		}
		if (index == length) {
			append(index);
			return true;
		}
		Node newNode = new Node(value);
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index == 0)
			return removeFirst();
		if (index == length - 1)
			return removeLast();
		Node pre = get(index - 1);
		Node temp = pre.next;
		pre.next = temp.next;
		temp.next = null;
		length--;
		return temp;

	}

	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next=before;
			before=temp;
			temp=after;
		}
	}
}
