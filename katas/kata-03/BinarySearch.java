class BinarySearch {


  /*
     0   1   2   3   4   5   6   7   8
   {10, 20, 30, 40, 50, 60, 70, 80, 90}
   */
  public static int search(int[] array, int n) {
    int result = -1;

    int low = 0; //0
    int high = array.length - 1; // 8
    int middle = low + (high - low) / 2; // 4

    while(high == middle) {
      if (array[middle] == n) {
        return middle;
      } else if(array[middle] > n) {
        high = middle;
        middle = low + (high - low) / 2;
      } else {
        low = middle;
        middle = low + high / 2;
      }
    }

    return result;
  }

  public static void main(String args[]) {
    int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    int result = search(array, 81);
    assert result == -1 : "Expected -1";
    System.out.println(result);
  }
}
