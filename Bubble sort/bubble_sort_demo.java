public class bubble_sort_demo {
	
	public static void main(String[] args) {
		String result = "";
		int []list = {18, 5, 7, 6, 45, 8, 13, 66, 36, 15, 5};
		
		list = bubble_sort(list, list.length);

		for (int i = 0; i < list.length; i++) {
			result += list[i] + " ";
		}
		
		System.out.print("\n" + result);
	}
	
	public static int[] bubble_sort(int []list, int size) {
		int swaps, temp;
		
		for (int i = 0; i < size -2; i++) {
			swaps = 0;
			
			for (int j = 0; j < size -i -1; j++) {
				if (list[j+1] < list[j]) {
					temp = list[j+1];
					list[j+1] = list[j];
					list[j] = temp;
							
					swaps++;
				}
			}
			
			if (swaps == 0) {
				break;
			}
		}
		
		return list;
	}
	
}
