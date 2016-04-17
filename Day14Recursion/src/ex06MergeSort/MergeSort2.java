package ex06MergeSort;


public class MergeSort2 {
	

	
	
	public static void main(String[] args){
		int[] b = {1,2,4,0, -3};
		MergeSort2 m = new MergeSort2();
		m.mergeSort(b);
		
		for (int i : b){
			System.out.println(i + ", ");
		}
		
	}

	public void mergeSort(int[] a) {

		int[] left;
		int[] right;

		if (a.length < 2) {
			return;
		}

		
		else {
			// divide the original array into several arrays equal in number to
			// the length of
			// the original array

			int midIndex = (a.length) / 2;
			System.out.println("midIndex " + midIndex);
			left = new int[midIndex];
			// populate left[];
			for (int w = 0; w < midIndex; w++) {
				left[w] = a[w];
			}

			if (a.length % 2 == 0) {
				right = new int[midIndex];
				// populate right[] is both arrays are of equal size;
				for (int x = midIndex; x < a.length; x++) {
					for (int y = 0; y < midIndex; y++) {
						right[y] = a[x];
					}
				}
			}

			else {
				right = new int[midIndex + 1];
				// populate right[] if right is one element bigger
				for (int z = midIndex; z < a.length; z++) {
					for (int s = 0; s < (midIndex + 1); s++) {
						right[s] = a[z];
					}
				}
			}
			mergeSort(left);
			mergeSort(right);

		}
		merge(left, right);
	}

	
	public void merge(int[] left, int[] right) {

		int[] updatedArray = new int[(left.length + right.length)];
		int indL = 0;
		int indR = 0;
		int ind = 0; // counter for filling the combined array
		
	

		while (ind < updatedArray.length) {
			for (ind = 0; ind < updatedArray.length; ind++) {

				System.out.println("indL " + indL);
				System.out.println("indR " + indR);
				System.out.println(" Left size: " + left.length);
				System.out.println(" Right size: " + right.length);
				if (left[indL] < right[indR]) {
					updatedArray[ind] = left[indL];
					indL++;
				} else {
					updatedArray[ind] = right[indR];
					indR++;
				}
			}
		}
		
		


	}
	
	
}

	
	
	