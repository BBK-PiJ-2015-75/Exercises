package ex06MergeSort;


public class MergeSort {
	

	
	
	public static void main(String[] args){
		int[] b = {1,2,4,0, -3};
		MergeSort m = new MergeSort();
		m.mergeSort(b);
		
		for (int i : b){
			System.out.println(i + ", ");
		}
		
	}

	// the array that needs to be sorted
	public void mergeSort(int[] a) {

		int[] left;
		int[] right;

		if (a.length <= 1) {
			return;
		}

		
		else {
			// divide the original array into several arrays equal in number to
			// the length of
			// the original array

			int midIndex = (a.length) / 2;
			left = new int[midIndex];
			// populate left[];
			for (int w = 0; w < midIndex; w++) {
				left[w] = a[w];
			}

			if (a.length % 2 == 0) { // an even numbered size array
				right = new int[midIndex];
				// populate right[] is both arrays are of equal size;
				int y = 0;
				for (int x = midIndex; x < a.length; x++) {
					right[y] = a[x];
					y++;
				}
			}

			else {
				right = new int[midIndex + 1];
				// populate right[] if right is one element bigger
				int z = 0;
					for (int s = midIndex; s < a.length; s++) {
						right[z] = a[s];
						z++;
					}
			}
			// keep calling left and right until both have size =1;
			mergeSort(left);
			mergeSort(right);

		}
		merge(left, right);
	}

	// i now have 2 arrays of size 1;
	public void merge(int[] left, int[] right) {

		int[] updatedArray = new int[(left.length + right.length)]; // empty for now
		int indL = 0;
		int indR = 0;
		int ind = 0; // counter for filling the combined array
		
		while (ind < updatedArray.length) {
			for (ind = 0; ind < updatedArray.length; ind++) {
				
				if (left[indL] <= right[indR]) {
					updatedArray[ind] = left[indL];
					indL++;
					ind++;
				} 
				else 
				if (right[indL] < left[indR]) {
					updatedArray[ind] = right[indL];
					indR++;
					ind++;
					}
				}
			}
		}
		

}

	
	
	