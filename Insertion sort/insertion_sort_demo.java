public class insertion_sort_demo {

	public static void main(String[] args) {
		String result = "";
		int []list = {18, 5, 7, 6, 45, 8, 13, 66, 36, 15, 5};
		
		list = insertion_sort(list, list.length);
		
		for (int i = 0; i < list.length; i++) {
			result += list[i] + " ";
		}
		
		System.out.print("\n" + result);
	}
	
	public static int[] insertion_sort(int []list, int size) {
		int current, j;
		
		for (int i = 1; i < size; i++) {
			current = list[i];
			j = i - 1;
			
			while (j > -1 && list[j] >= current) {
				list[j+1] = list[j];
				j--;	
			}
			
			list[j+1] = current;
		}
		
		return list;
	}

}
