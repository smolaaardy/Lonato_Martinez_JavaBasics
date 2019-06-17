import java.util.ArrayList;
import java.lang.ArrayIndexOutOfBoundsException;

// Print 1-255
// Write a method that prints all the numbers from 1 to 255.
public class Basics{


	public void print255(){
		for(int i = 1; i < 256; i++){
			System.out.println(i);
		}
	}

	// Print odd numbers between 1-255
	// Write a method that prints all the odd numbers from 1 to 255.
	public void printOdd255(){
		for(int i = 1; i < 256; i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	}
// 	Print Sum
// Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far.
	public void printSum(){
		int sum = 0;
		for(int i = 0; i < 256; i++){
			String count = "" + i;
			sum += i;
			String sumstring = "" + sum;
			String total = "Number: " + count + "Sum: " + sumstring;
			System.out.println(total);
		}
	}
// 	Iterating through an array
// Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
	public void iterating(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	// }
	// Find Max
	// Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
		public Integer findMax(int[] arr){
			int max = arr[0];
			for(int i = 0; i < arr.length; i++){
				if(arr[i] > max){
					max = arr[i];
				}
			}
		return max;

		}
// 		Get Average
// Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
		public Integer getAverage(int[] arr){
			int sum = 0;
			for(int i = 0; i < arr.length; i++){
				sum += arr[i];
			}
			int avg = sum / arr.length;
			return avg; 
		}
// 		Array with Odd Numbers
// Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
		public void arrOddNumber(){
			ArrayList<Integer> newarr = new ArrayList<Integer>();
			for(int i = 1; i <= 255; i++){
				if(i % 2 != 0){
					newarr.add(i);
				}
			}
		}
// 		Greater Than Y
// Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
		public Integer greaterThanY(int[] arr, int y){
			int greatersum = 0;
			for(int i = 0; i < arr.length; i++){
				if(arr[i] > y){
					greatersum ++;
				}
			}
		return greatersum; 
		}
// 		Square the values
// Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
		public int[] squareValues(int[] arr){
			for(int i = 0; i < arr.length; i++){
				arr[i] = arr[i] * arr[i];
			}
		return arr;
		}
// 		Eliminate Negative Numbers
// Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
		public int[] eliminateNegs(int[] arr){
			for(int i = 0; i < arr.length; i++){
				if(arr[i] < 0){
					arr[i] = 0;
				}
			}
		return arr;
		}
	// Max, Min, and Average
	// Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
		public int[] minMaxAvg(int[] arr){
			int avg = 0;
			int sum = 0; 
			int maxnum = arr[0];
			int minnum = arr[0];
			for(int i = 0; i < arr.length; i++){
				if(arr[i] < minnum){
					minnum = arr[i];
				}
				if(arr[i] > maxnum){
					maxnum = arr[i]; 
				}
			sum += arr[i];
			}
		avg = sum / arr.length;
		int[] thing = {maxnum, minnum, avg};
		return thing;
		}
// 		Shifting the Values in the Array
// Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds. 
		public int[] shiftTheValues(int[] arr){
			for(int i = 0; i < arr.length; i++){
				try{
				arr[i] = arr[i + 1]; 
				}
				catch(ArrayIndexOutOfBoundsException e){
				arr[i] = 0;
				}
			}
		return arr; 
		}
}