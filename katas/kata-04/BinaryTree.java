class Node {
  public int data;
  public Node left;
  public Node right;
  public int level;

  public Node(int data, Node left, Node right, int level) {
    this.data = data;
    this.left = left;
    this.right = right;
    this.level = level;
  }
}
/*
              27
             / \
         14      35
        / \     /  \
      10   19  31  42
*/
public class BinaryTree {

  public static Node root;

  public static void insert(Node node, int data) {
    if (root != null) {
      if (node.data == data) {
        System.err.println("ERROR: Node aleady exists!");
        return;
      }

      if (node.data > data) {
        if (node.left == null) {
          node.left = new Node (data, null, null, node.level++);
          return;
        } else {
          insert(node.left, data);
        }
      } else {
        if (node.right == null) {
          node.right = new Node (data, null, null, node.level++);
          return;
        } else {
          insert(node.right, data);
        }
      }
    } else {
      root = new Node(data, null, null, 0);
    }
  }

  public static void printTree(Node node, String[] rows) {
    rows[node.level] += " " +node.data;

    if (node.left != null) {
      printTree(node.left, rows);
    }

    if (node.right != null) {
      printTree(node.right, rows);
    }
    return;
  }

  public static Node findNode(Node node, int data) {
    if (node.data == data) {
      return node;
    }
    if (node.data > data && node.left != null) {
      return findNode(node.left, data);
    } else if (node.data < data && node.right != null) {
      return findNode(node.right, data);
    }
    return null;
  }

  public static int getMaxLevel(Node node) {
    if (node.left == null && node.right == null) {
      return node.level;
    }
    if (node.left != null) {
       getMaxLevel(node.left);
    }
    if (node.right != null) {
       getMaxLevel(node.right);
    }
    return -1;
  }

  public static void main(String[] args) {
    insert(root, 27);
    assert root != null : "Expected root != null";
    assert root.data == 27 : "Expected root.data == 27";

    insert(root, 14);
    insert(root, 19);
    insert(root, 10);
    insert(root, 5);
    insert(root, 35);

    Node n = findNode(root, 10);
    assert n != null : "Expected n != null, actual value " + n;
    System.out.println("Finded node: " + n.data + " node level: " + n.level);
    n = findNode(root, 35);
    System.out.println("Finded node: " + n.data + " node level: " + n.level);

    int level = getMaxLevel(root);
    assert level == 3 : "Expected level = 3, actual value = " + level;
    System.out.println("Max level: " + level);
    printTree(root, new String[level]);
  }
}
