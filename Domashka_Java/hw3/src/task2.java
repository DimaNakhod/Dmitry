public class task2 {
	public static void main(String[] args) {
        int[] array;
		array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < 9; i++){
			for (int j = 2; j <= array[i]/2; j++){
				if (array[i]%j == 0 && array[i] != j){
                array[i] = 0; 
				}
			}
			if (array[i] != 0){
			System.out.print (array[i]);
			}
		}   
	}
}         