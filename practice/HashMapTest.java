package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * 
 * **/
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String, String>();
		map.put("3", "blue");
		map.put("2", "green");
		map.put("1","dancing");
		map.put("4", "tall");
		map.put("8", "brown");
		map.put("6", "warm");
		map.put(null,"bbb");
		map.put(null,null);
		Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<String,String> entry = iterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key:"+key + " "+"value:"+value);
		}
		/*输出结果：
		 * key:1 value:dancing
key:2 value:green
key:3 value:blue
key:4 value:tall
key:6 value:warm
key:8 value:brown
		 * */
		System.out.println("#####################");
		Map<String,String> linkMap = new LinkedHashMap<String, String>();
		linkMap.put("3", "blue");
		linkMap.put("2", "green");
		linkMap.put("1","dancing");
		linkMap.put("4", "tall");
		linkMap.put("8", "brown");
		linkMap.put("6", "warm");
		Iterator<Map.Entry<String,String>> iterator1 = linkMap.entrySet().iterator();
		while(iterator1.hasNext()){
			Map.Entry<String,String> entry = iterator1.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key:"+key + " "+"value:"+value);
		}
		/**
		 * 输出;
		 * key:3 value:blue
key:2 value:green
key:1 value:dancing
key:4 value:tall
key:8 value:brown
key:6 value:warm
		 * */
	}

}
