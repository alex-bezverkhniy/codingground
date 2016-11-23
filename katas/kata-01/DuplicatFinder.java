public class DuplicatFinder {
  public static int find1(int[] array) {
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array.length; j ++) {
        if(array[i] == array[j]) {
          return array[i];
        }
      }
    }
    return -1;
  }
  public static int find2(int[] array) {
    for(int i = 0, j = (array.length - 1); i < array.length; i++, j--) {
      if(array[i] == array[j]) {
        return array[i];
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] array = {1,2,3,1,4,5,6,7,8,9};
    System.out.println(find1(array));
    System.out.println(find2(array));
  }
}
