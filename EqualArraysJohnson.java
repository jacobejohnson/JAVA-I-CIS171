import java.util.Arrays;
import java.util.Scanner;
public class EqualArraysJohnson {
	Scanner in = new Scanner(System.in);
	
	 public static void main(String[] args) {
		 int[] a1 = {1, 2, 3, 4, 5};
		 int[] a2 = {1, 2, 3, 4, 5};
		 int[] a3 = {2, 4, 6, 8, 10};
		 int[] a4 = {1, 3, 5, 7, 9, 11};
		 
		 isSame1(int[], int[]);
		 
		 
	 }
	 public static boolean isSame1(int[] a1, int[] a2) {
		 boolean equal1 = false;
		 if (a1.length == a2.length) {
			 for(int i = 0; i < a1.length; i++) {
				 if(a1[i] != a2[i]) {
					 equal1 = false;
				 }else {
					 equal1 = true;
				 }
				 if (equal1) {
					 return true;
				 }else {
					 return false;
				 }
			 }
		 }else {
			 return false;
		 }
	 }
}