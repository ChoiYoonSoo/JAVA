import java.util.*;
public class ArrayProc{
	
	public void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			System.out.println(+i+1+"��° �迭�� �� �Է�: ");
			array[i] = scan.nextInt();
		}
	}
	
	private double result = 0;
	public double getAverage(int[] array) {
		for(int i=0; i<array.length; i++) {
			result += array[i];
		}
		return result/array.length;
	}
}
