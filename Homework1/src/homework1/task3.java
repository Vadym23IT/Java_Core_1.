package homework1;

public class task3 {

	public static void main(String[] args) {
	int min = 0;
	int max = 0;
	int array[] = new int [10]; 
	for(int i = 0; i < array.length; i++) {
		array[i] = i;
		if(min > array[i]) {
			min = array[i];
		}
		if(max < array[i]) {
			max = array[i];
		}
	}
	System.out.println("Мінімальне значення масиву -> " + min + " а максимальне значення масиву -> " + max);
	}

}
