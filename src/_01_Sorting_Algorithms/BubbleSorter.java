package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	/*
	 * Use the bubble sorting algorithm to sort the array. You can use
	 * display.updateDisplay() to show the current progress on the graph.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int first = 1; first < array.length; first++) {
				if (array[first] < array[first - 1]) {
					unsorted = true;
					
					int temp = array[first];
					array[first] = array[first - 1];
					array[first - 1] = temp;
					
					display.updateDisplay();
				}

			}
			
		}

	}
}


