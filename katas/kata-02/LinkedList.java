class LinkedList {
  class Node {
    public Node(Object data, Node next) {
      this.data = data;
      this.next = next;
    }
    public Object data;
    public Node next;
  }

  private Node head;

  public LinkedList(Object data) {
    head = new Node(data, null);
  }

  public void insert(Object data) {
    Node newNode = new Node(data, this.head);
    this.head = newNode;
  }

  public boolean delete(Object data) {
    Node prevNode = null;
    Node currentNode = this.head;
    do {
      if (currentNode.data.equals(data)) {
        if (prevNode == null) {
          this.head = currentNode.next;
        } else {
          prevNode.next = currentNode.next;
        }
        return true;
      }
      prevNode = currentNode;
      currentNode = currentNode.next;
    } while(currentNode != null);
    return false;
  }

  public Node search(Object data) {
    Node currentNode = this.head;
    do {
      if(currentNode.data.equals(data)) {
        return currentNode;
      }
      currentNode = currentNode.next;
    } while(currentNode != null);
    return null;
  }

  public void display() {
    System.out.println();
    Node currentNode = this.head;
    do {
      System.out.println(currentNode.data.toString());
      currentNode = currentNode.next;
    } while(currentNode != null);
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(0);
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    ll.insert(6);
    ll.insert(7);
    ll.insert(8);
    ll.insert(9);

    ll.display();

    System.out.println(ll.search(2).data);

    ll.delete(2);

    ll.display();
    ll.delete(0);
    ll.display();

    ll.delete(9);
    ll.display();

    System.out.println();
  }
}
