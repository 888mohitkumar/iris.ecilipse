package com.iris;

import java.util.HashMap;

public class Test_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		System.out.println("capacity of Hashmap ::"+hm.size());
		for(int i=0; i<50; i++)
		 {

			hm.put(i, 'a');
			System.out.println("value of i is ::"+i);
			System.out.println("size of ::"+hm.size());
		 }
		System.out.println(hm);	
	}

}
