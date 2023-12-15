package Examples.Test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Helllo Bhaumik");
		// Count chars
		String s = "Hello Bhaumik";
		char[] ch = s.toCharArray();
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < ch.length; i++) {
			String s1 = String.valueOf(ch[i]).toLowerCase();
			map.merge(s1, 1, Integer::sum);
		}

		 System.out.println(map);


		System.out.println("Start -- Using Java 8 ");
	
		List<String> listChar = s.chars().mapToObj(chars->String.valueOf((char)chars).toLowerCase()).collect(Collectors.toList());
		
		Map<String, Long> countAlbhabet=listChar.stream()
												.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting()));
		countAlbhabet.entrySet().stream().filter(e-> e.getValue()>1)
								.collect(Collectors.toMap(Entry::getKey, Entry::getValue))
								.entrySet().forEach(e-> System.out.println(e.getKey()+"-- "+e.getValue()));
		
		System.out.println("#####   "+countAlbhabet);
		System.out.println("Close -- Using Java 8 ");

		
		
		int[] array = { 7, 8, 9, 1, 2, 3, 7, 8, 9 };
		// 1 - 789 2- 123 3- 789123
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);

		}
		System.out.println(set);
		
		/*Alternate logic using Java 8*/
		System.out.println("Unique elements using java 8");
		Set uniqueSet = Arrays.stream(array).boxed().collect(Collectors.toSet());
		System.out.println("Unique Elements ::-- "+uniqueSet);
		
		
		Set<Integer> dublicate = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (!dublicate.add(array[i])) {
				System.out.print(array[i]);
			}
		}
		System.out.println();
		
		/*Find duplicate element using Java 8*/
		Set<Integer> dublicateSet = new HashSet<>();
		List<Integer> duplicateEles = Arrays.stream(array).boxed().filter(ele-> !dublicateSet.add(ele)).collect(Collectors.toList());
		System.out.println("Duplicate Elements ::-- "+duplicateEles);	
		
		
		Map<String, Integer> unique = new LinkedHashMap<>();
		for (int i = 0; i < array.length; i++) {
			String key = String.valueOf(array[i]);
			if (unique.containsKey(key)) {
				unique.put(key, unique.get(key) + 1);
			} else {
				unique.put(key, 1);
			}
		}
		System.out.println();
		for (Entry<String, Integer> entry : unique.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey());
			}
		}
	
	//Using putIfAbsent 
		int[] intArray = { 7, 8, 9, 1, 2, 3, 7, 8, 9 };
		
		Map<Integer,Integer> putIfMap = new LinkedHashMap<Integer,Integer>();
		 for(int i=0;i<intArray.length;i++) {
			 if(putIfMap.putIfAbsent(intArray[i], 1) !=null) {
				 putIfMap.put(intArray[i], putIfMap.get(intArray[i]) +1);
			 }
		 }
		 System.out.println(putIfMap);
		
	}
	

}
