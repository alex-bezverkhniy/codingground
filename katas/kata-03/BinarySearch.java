class BinarySearch {

  public static int search(int[] array, int n) {


    return -1;
  }

  public static void main(String args[]) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    assert search(array, 5) == 4 : "Expected 4";
    System.out.println(search(array, 5));
  }
}
