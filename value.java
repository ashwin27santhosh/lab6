package lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class GetValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GetValues obj= new GetValues();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean i = true;
		int j = 0;
		while(i) {
			System.out.println("choose:");
			System.out.println("1)Enter the values:");
			System.out.println("2)exit");
			switch(sc.nextInt()) {
			case 1: System.out.println("Enter the value to insert in hashmap");
			        map.put(j++,sc.nextInt());
			        break;
			case 2: i = false;
			        break;
			}
		}
		List<Integer> list = obj.getValues(map);
		for(int value: list) {
		      System.out.print(value+" ");
		}
		
	}
public List<Integer> getValues(HashMap<Integer , Integer> map){
	    
	    
	    Collection<Integer> values = map.values();
	    List<Integer> list = new ArrayList<>(values);
	    Collections.sort(list);
	    
	    return list;
		
		
	}
	
}