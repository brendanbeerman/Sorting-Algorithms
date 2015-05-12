public class selection_sort_demo {

	public static void main(String[] args) {
		String result = "";
		int []list = {18, 5, 7, 6, 45, 8, 13, 66, 36, 15, 5};
		
		list = selection_sort(list, list.length);

		for (int i = 0; i < list.length; i++) {
			result += list[i] + " ";
		}
		
		System.out.print("\n" + result);
	}
	
	public static int[] selection_sort(int []list, int size) {
		int key, location; 
		
		for (int i = 0; i < size; i++) {
			key = list[i];
			location = i;
			
			for (int j = i + 1; j < size; j++) {
				if (list[j] < key) {
					key = list[j];
					location = j;
				}
			}
			
			list[location] = list[i];
			list[i] = key;
		}
		
		return list;
	}

}
