package com.learn.sort;

/**
 * @author nimmicv
 * 
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 100, 80, 91, 77, 65, 53, 45, 36, 28, 14, 8, 3, 98, 76,
				54, 7, 8, 14, 13 };
		MergeSort mes = new MergeSort();
		mes.mergeSort(array);
		mes.display(array);
	}

	public void mergeSort(int[] array) {
		int arraylength = array.length;
		int[] temp_array = new int[array.length];
		int i;
		int size = 1;
		int j = 0;
		int lb1 = 0, ub1 = 0, lb2 = 1, ub2 = 1;
		//iterate for all size < arraylength
		while (size < arraylength) {
			lb1 = 0;
			j = 0;
			//iterate for all pairs
			while (lb1 + size < arraylength) {
				ub1 = lb1 + size - 1;
				lb2 = ub1 + 1;
				ub2 = lb2 + size - 1;

				if (ub2 > (arraylength - 1)) {
					ub2 = arraylength - 1;
				}

				while (lb1 <= ub1 && lb2 <= ub2) {
					if (array[lb1] <= array[lb2]) {
						temp_array[j++] = array[lb1++];
					} else {
						if (array[lb2] <= array[lb1]) {
							temp_array[j++] = array[lb2++];
						}
					}

				}
				if (lb1 <= ub1) {
					while (lb1 <= ub1) {
						temp_array[j++] = array[lb1++];
					}
				}
				if (lb2 <= ub2) {
					while (lb2 <= ub2) {
						temp_array[j++] = array[lb2++];
					}
				}
				lb1 = ub2 + 1;
			}
			if (lb1 < arraylength) {
				for (i = lb1; i < arraylength; i++)
					temp_array[i] = array[i];
			}
			for (i = 0; i < array.length; i++) {
				array[i] = temp_array[i];
			}

			size = size * 2;
		}
	}

	public void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
