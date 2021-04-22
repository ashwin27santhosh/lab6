package lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GetSecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		System.out.println("Enter elements: ");
		for(int i =0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		GetSecondSmallest obj = new GetSecondSmallest();
		int element = obj.getSmallestElement(a);
		System.out.println("Second smallest element is : "+ element);
	}
	public int getSmallestElement(Integer[] a) {
		List<Integer> al = Arrays.asList(a);
		Collections.sort(al);
		int element =  al.get(1);
		return element;
	}
}