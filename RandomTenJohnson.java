//Jacob Johnson
import java.util.Random;
public class RandomTenJohnson {
	private static int[] randomArray;
	public static void main(String[] args) {
		randomArray = new int[10];
		Random rand = new Random();
		System.out.print("All array items: ");
		for (int i = 0; i < randomArray.length; i++) {
		randomArray[i] = rand.nextInt(20)+1;
		System.out.print(randomArray[i] + " ");
		}
		System.out.println();
		System.out.print("Even index items: ");
		for (int i = 0; i < randomArray.length; i=i+2){
	    	 System.out.print(randomArray[i]+", ");
	    }
		System.out.println();
		System.out.print("Even elements: ");
		for (int i = 0; i < randomArray.length; i++){
	    	 if (randomArray[i] % 2 == 0){
	    		 System.out.print(randomArray[i]+", ");
	    	 }
		}
		System.out.println();
		System.out.print("Reversed array: ");
		for (int i = randomArray.length - 1; i >= 0; i--) {
			System.out.print(randomArray[i]+", ");
		}
		System.out.println();
		System.out.println("First array element: " + randomArray[0]);
		System.out.println("Last array element: " + randomArray[9]);
		System.out.println("Highest number in array: " + findLargest(randomArray));
		System.out.println("Lowest number in array: " + findLowest(randomArray));
	}
	
	public static int findLargest(int[] array){
		 int largest = array[0];
		 for (int i=1; i < array.length; i++){
			 if (array[i] > largest){
				 largest = array[i];
			 }
		 }
		 return largest;
	 }
	 
	 public static int findLowest(int[] array){
		 int smallest = array[0];
		 for (int i=1; i < array.length; i++){
			 if (array[i] < smallest){
				 smallest = array[i];
			 }
		 }
		 return smallest;
	 }
}
