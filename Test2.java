package Examples.Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Bhaumik");
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Papaya");
		list.add("Orange");

		Map<Character, Integer> countMap = new HashMap();
		for (String s : list) {
			char[] c = s.toCharArray();

			for (char ele : c) {
				    char lowerCase = Character.toLowerCase(ele);
				if (countMap.containsKey(lowerCase)) {
					countMap.put(lowerCase, countMap.get(lowerCase) + 1);
				} else {
					countMap.put(lowerCase, 1);
				}
			}

		}
		
		System.out.println(countMap);		
		Map countWord = list.stream().collect(Collectors.groupingBy(ele->ele,Collectors.counting()));
		
		String str [] = {"Apple","Banana","Orange"};
		
		Map  map =Arrays.stream(str).collect(Collectors.groupingBy(ele->ele,Collectors.counting()));
		System.out.println(map);
		
		System.out.println("@@@ "+countMap);
	
		Map<String, Map<Character,Integer>> countMap1 = new HashMap();
		for (String s : list) {
			char[] c = s.toCharArray();
			Map<Character,Integer> insideMap= new HashMap<>();
			
			for (char ele : c) {
				    char lowerCase = Character.toLowerCase(ele);
				insideMap.merge(lowerCase, 1, Integer::sum);
				countMap1.put(s, insideMap);
			}

		}
		
	System.out.println(countMap1);	
	}

	
	
	
	
	
}
