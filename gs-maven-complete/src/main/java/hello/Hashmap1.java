package hello;
import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,String> map = new HashMap<Integer,String>();
	 map.put(5,"Five");
	 map.put(6, "Six");
	 map.put(7, "Seven");
	 map.put(8, "Eight");
	
	 String text = map.get(6);
	
	 System.out.println(text);
	 
	 for (Entry<Integer, String> entry:map.entrySet()){
		 int key = entry.getKey();
		 String value = entry.getValue();
		 
		 System.out.println(key + " "+ value);
		 
		 
	 }
	}

}
