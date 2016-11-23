
import java.util.Date;

public class BinarySearch01 {

	private int[] array;// = {0,1,2,3,4,5,6,7,8,9,10};

	public BinarySearch01() {
		array = new int[100000000];
		for(int i = 0; i < 100000000;i++) {
			array[i] = i;
		}
	}

	public int iterationSearch(int val) {
		Date startDate = new Date();
		int i = 0;

		for(;i < array.length; i++) {
			if(array[i] == val) {
				break;
			}
		}
		System.out.println("iterationSearch total time: " + (new Date().getTime() - startDate.getTime()));
		return i;
	}

	public int iterationSearch2(int val) {
		Date startDate = new Date();
		int r = -1;
	
		for(int j = array.length - 1, i = 0; i <= j ; i++, j--) {
			if(array[i] == val) {
				r = i;
				break;
			}
			
			if(array[j] == val) {
				r = j;
				break;
			}	
		}
		System.out.println("iterationSearch2 total time: " + (new Date().getTime() - startDate.getTime()));	
		return r;
	}

	public static void main(String agrs[]) {
		BinarySearch01 bs = new BinarySearch01();

		 System.out.println(bs.iterationSearch(5));
		 System.out.println(bs.iterationSearch2(9));
	}
}
