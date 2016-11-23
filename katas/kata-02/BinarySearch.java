import java.util.function.*;
import java.util.*;

public class BinarySearch {

  public static int chop(Integer elem, Integer[] array) {
    for (int i = 0; i < array.length; i ++) {
      if(elem == array[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int chop2(Integer elem, Integer[] array) {
    for(int i = 0, j = array.length-1; i <= j; i++, j--) {
      if(elem == array[i]) {
        return i;
      }
      if(elem == array[j]){
        return j;
      }
    }
    return -1;
  }

  public static int chop3(Integer elem, Integer[] array) {
    int i = array.length / 2;

    while(!(i < 0 || i > array.length - 1)) {
      if (array[i] == elem) {
        return i;
      }
      i = (array[i] < elem) ? i + 1 : i - 1;
    }
    return -1;
  }

  public static void test(Integer[] array, BiFunction<Integer, Integer[], Integer> f) {
    assertIt(0, f.apply(1, array));
    assertIt(-1, f.apply(8, array));
    assertIt(1, f.apply(3, array));
  }

  public static void assertIt(Integer expected, Integer result) {
    assert result == expected : String.format("Expected %d but got %d", expected, result);
    System.out.println(String.format("%d == %d OK", expected, result));
  }

  public static void main(String[] args) {
    Integer[] array = {1, 3, 5};

    // v1
    System.out.println("v1");
    test(array, BinarySearch::chop);
    test(new Integer[] {1, 3, 5, 6, 7}, BinarySearch::chop);
    System.out.println("OK\n");

    // v2
    System.out.println("v2");
    test(array, BinarySearch::chop2);
    test(new Integer[] {1, 3, 5, 6, 7}, BinarySearch::chop2);
    System.out.println("OK\n");

    // v3
    System.out.println("v3");
    test(array, BinarySearch::chop3);
    test(new Integer[] {1, 3, 5, 6, 7}, BinarySearch::chop3);
    System.out.println("OK\n");

  }
}
