package hello;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> set1  = new HashSet<String>();
    Set<String> set2= new LinkedHashSet<String>();
    
    set1.add("abc");
    set1.add("dfsd");
    set1.add("5");
    set1.add("mouse");
    set1.add("mouse1");
    
    
    set2.add("hello");
    set2.add("adasdasf");
    set2.add("mouse");
    set2.add("mouse1");
    System.out.println("Set1 " + set1);
    System.out.println("set2" + set2);
    
    
    for (String i: set1) {
       System.out.println("set " + i); 	
    }
	}

}
