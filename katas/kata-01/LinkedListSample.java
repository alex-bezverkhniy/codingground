class LinkedListNode {
    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }
}
public class LinkedListSample {
    public static String myFunction(String arg) {
        // write the body of your function here
        return "running with " + arg;
    }
    public static void printList(LinkedListNode head) {
        LinkedListNode n = head;
        while(n != null) {
            System.out.println(n.value);
            n = n.next;
        }
        System.out.println();
    }
    public static LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode reversed = null;
        LinkedListNode current = head;
        while(current != null) {
          LinkedListNode next = current.next;
          current.next = reversed;
          reversed = current;
          current = next;
        }
        return reversed;
    }
    public static LinkedListNode reverse2(LinkedListNode head) {
        LinkedListNode reversed = null;
        LinkedListNode current = head;
        while(current != null) {
          LinkedListNode next = current.next;
          current.next = reversed;
          reversed = current;
          current = next;
        }
        return reversed;
    }
    public static int size(LinkedListNode head) {
      int size = 0;
      LinkedListNode n = head;
      while(n != null) {
          size++;
          n = n.next;
      }
      return size;
    }
    public static void printListRecursion(LinkedListNode head) {
      if (head != null) {
        System.out.println(head.value);
        printListRecursion(head.next);
      }
    }
    public static LinkedListNode reverseRecursion(LinkedListNode head, LinkedListNode reversed) {
      if (head != null) {
        LinkedListNode next = head.next;
        head.next = reversed;
        reversed = head;
        return reverseRecursion(next, reversed);
      } else {
        return reversed;
      }
    }
    public static void main(String[] args) {
        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(2);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode n4 = new LinkedListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printList(n1);
        n1 = reverseRecursion(n1, null);
        printListRecursion(n1);
    }
}
