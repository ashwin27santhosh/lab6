package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VoterList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		map.put(100, 45);
		map.put(101, 34);
		map.put(102, 13);
		map.put(103, 23);
		map.put(104, 7);
		VoterList obj = new VoterList();
		List<Integer> idList = obj.votersList(map);
		System.out.println("Voter List: ");
		for(Integer id: idList) {
			System.out.println(id);
		}

	}
	public List<Integer> votersList(Map<Integer, Integer> m){
		List<Integer> idList = new ArrayList<>();
		for(Map.Entry<Integer, Integer> map : m.entrySet()) {
			if(map.getValue()>18) {
				idList.add(map.getKey());
			}
		}
		return idList;
	}
}