package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMedals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> student = new HashMap<Integer, Integer>();
		student.put(100, 90);
		student.put(101, 75);
		student.put(102, 96);
		student.put(103, 84);
		
		StudentMedals obj = new StudentMedals();
		HashMap<Integer, String> stdList = obj.getStudents(student);
		//System.out.println(stdList);
		for(Map.Entry<Integer, String> std: stdList.entrySet()) {
			System.out.println("Student Registration Id: "+std.getKey()+" and won: "+std.getValue());
		}
		

	}
	public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> student){
		HashMap<Integer, String> stdList = new HashMap<Integer, String>();
		for(Map.Entry<Integer, Integer> std: student.entrySet()) {
			if(std.getValue() >= 90) {
				stdList.put(std.getKey(), "Gold");
			}
			else if(std.getValue()>= 80 && std.getValue() < 90) {
				stdList.put(std.getKey(), "Silver");
			}
			else if(std.getValue()>= 70 && std.getValue() < 80) {
				stdList.put(std.getKey(), "Bronze");
			}
			else {
				stdList.put(std.getKey(), "No Medal");
			}
			
		}
		return stdList;
		
	}
}