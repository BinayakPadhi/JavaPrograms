package programs;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(10);
		array.add(20);
		array.add(1,15);
		array.add(5);
		System.out.println("Before Sorting the array is "+array);
		/*Collections.sort(array);
		Collections.reverse(array);*/
		Collections.sort(array, Collections.reverseOrder());
		System.out.println("After Sorting the array in desc is  "+array);
		System.out.println("After Sorting the array in desc is  ");
		/*Collections.reverse(array);
		System.out.println("After Sorting the array in descending order "+array);*/

	}

}
