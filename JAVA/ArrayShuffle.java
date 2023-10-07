import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> list = Arrays.asList(arr);

		Collections.shuffle(list);

		Integer[] arr2 = list.toArray(new Integer[0]);

	    	for (Integer a : arr2) {
			System.out.print(a + " ");
		}

	}
}
