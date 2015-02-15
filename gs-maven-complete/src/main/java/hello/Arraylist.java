package hello;

import java.util.ArrayList;

public class Arraylist {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> num =  new ArrayList<Integer>();
    num.add(10);
    num.add(20);
    num.add(30);
    
    for(int i=0;i< num.size();i++)
    System.out.println(num.get(i));
    
    num.remove(1);
    
    for(Integer j:num)
    	System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> num =  new ArrayList<Integer>();
	num.add(10);
	num.add(20);
	num.add(30);
	
	for(int i=0;i< num.size();i++)
	System.out.println(num.get(i));
	
	num.remove(1);
	
	for(Integer j:num)
		System.out.println(j);
	}

}
