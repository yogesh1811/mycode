package DS;

public class LinkeListTest {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll = new LinkList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);

		ll.insertTo(50, -1);

		System.out.println(ll);

	}

	static class Node {
		Node next;
		int data;

		public Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	static class LinkList {
		Node head;

		public LinkList() {
			head = null;
		}

		public void insert(int data) {
			Node node = new Node(data);
			node.data = data;
			if (head == null) {
				head = node;
			} else {
				Node current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = node;
			}
		}

		public void insertTo(int data, int pos) {
			Node node = new Node(data);
			node.data = data;
			if (head == null) {
				head = node;
			} else {
				Node current = head;
				Node next = null;
				int idx = 0;
				while (idx < pos - 1) {
					current = current.next;
					if (current.next != null) {
						next = current.next;
					}
					idx++;
				}
				if(pos==0){
					node.next = head;
					head = node;
				}else{
					node.next = next;
					current.next = node;
				}
				
			}
		}

	}

}
