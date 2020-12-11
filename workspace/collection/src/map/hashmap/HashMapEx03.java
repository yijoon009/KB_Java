package map.hashmap;

import java.util.*;

public class HashMapEx03 {
	public static void main(String[] args) {
		String[] data = {"A","C","R","E","S","A"};
		HashMap map = new HashMap<>();
		for(int i=0;i<data.length;i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}else {
				map.put(data[i], new Integer(1));
			}
		}
		//전체출력 Iterator it = map.entrySet().iterator();
		Set<Map.Entry<String[], Integer>> entryS = map.entrySet();
		Iterator<Map.Entry<String[], Integer>> iter = entryS.iterator();
		while(iter.hasNext()) {
			Map.Entry<String[], Integer> entry = iter.next();
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey() +": "+printBar('#',value)+" "+value);
		}
	}
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		for(int i=0;i<bar.length;i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}
	
}
