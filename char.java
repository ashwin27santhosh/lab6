package lab6;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
public static void main(String[] args) {
	CharCount obj = new CharCount();
	char[] arr = {'a','b','a'};
	Map<Character, Integer> m = new HashMap<Character, Integer>();
	m = obj.countChars(arr);
	for (Map.Entry entry : m.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
public Map<Character, Integer> countChars(char[] arr) {
	Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	for(char c : arr) {
		if (charCountMap.containsKey(c)) {
            charCountMap.put(c, charCountMap.get(c) + 1);
        }
        else {
            charCountMap.put(c, 1);
        }
	}
	return charCountMap;
}
}