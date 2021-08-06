package task8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HighestVowelCount {

	public static void main(String[] args) {

		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";

		
		System.out.println(sortSentenceBasedOnVowelCount(s));

	}

	public static String sortSentenceBasedOnVowelCount(String s) {
		
		Map<Integer, String> map = new TreeMap<>();
		String ar[] = s.split(" ");
		Arrays.sort(ar, Collections.reverseOrder());
		
		for (String w : ar) {
			int count = 0;
			String str = w.toLowerCase();
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                count++;
	            }  
			}
				if(map.containsKey(count)) {
					String temp=map.get(count);
					temp = temp + " " + w;
					map.put(count, temp);
				}
				else {
					map.put(count, w);
				}
			}
		
		
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer, String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}

}
