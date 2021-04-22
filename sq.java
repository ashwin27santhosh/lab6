package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetSquares {
public static void main(String[] args) {
	GetSquares obj = new GetSquares();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the elements:");
	for(int i =0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	m = obj.getSquares(arr);
	for(Map.Entry<Integer, Integer> entry: m.entrySet()) {
		System.out.println("number: "+ entry.getKey()+" and it's square: "+entry.getValue());
	}
}
public Map<Integer, Integer> getSquares(int[] arr){
	Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	for(int i:arr) {
		m.put(i,i*i);
	}
	return m;
	
}
}