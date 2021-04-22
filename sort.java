package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GetSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements:");
		for(int i =0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		GetSorted obj = new GetSorted();
		int[] arr = obj.getSorted(a, n);
		for(int i =0; i < n ;i++) {
			System.out.println(arr[i]);
		}
	}
	public int[] getSorted(int[] a, int n) {
		List<Integer> list = new ArrayList<>();
		for(int i =0; i < n; i++) {
			StringBuilder s1 = new StringBuilder();
			s1.append(a[i]);
			s1.reverse();
			String s2 = s1.toString();
			list.add(Integer.parseInt(s2));
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			  a[i] = list.get(i);
		}
		return a;
	}
}