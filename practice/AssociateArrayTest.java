package practice;

import java.security.PublicKey;

public class AssociateArrayTest<K,V>  {

	private Object[][] paris;
	private int index;
	public AssociateArrayTest(int length){
		paris = new Object[length][2];
	}
	public void put(K key,V value){
		if(index>=paris.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		paris[index++] = new Object[]{key,value};
	}
	@SuppressWarnings("unchecked")
	public V get(K key){
		for(int i = 0;i<index;i++){
			if(key.equals(paris[i][0])){
				return (V) paris[i][1];
			}
		}	
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssociateArrayTest<String, String> map = new AssociateArrayTest<String,String>(6);
		map.put("sky", "blue");
		map.put("grass", "green");
		map.put("ocean","dancing");
		map.put("tree", "tall");
		map.put("earth", "brown");
		map.put("sun", "warm");
		
		System.out.println("earth:"+map.get("earth"));
	}
	

}
