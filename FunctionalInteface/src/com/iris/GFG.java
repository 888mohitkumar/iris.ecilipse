package com.iris;

import java.util.HashMap;

class Key { 
    String key; 
    Key(String key) 
    { 
        this.key = key; 
    } 
  
    @Override
    public int hashCode() 
    { 
        int hash = (int)key.charAt(0); 
        System.out.println("hashCode for key: "
                           + key + " = " + hash); 
        return hash; 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        return key.equals(((Key)obj).key); 
    } 
} 
  
// Driver class 
public class GFG { 
    public static void main(String[] args) 
    { 
        HashMap<Key,Integer> map = new HashMap<>(); 
        map.put(new Key("vishal"), 20); 
        map.put(new Key("vachin"), 30); 
        map.put(new Key("vaibhav"), 40);
        map.put(new Key("vaishali"), 40);
        map.put(new Key("vaibhavi"), 40);
        map.put(new Key("vaibhavana"), 40); 
        map.put(new Key("vaibu"), 40);
        map.put(new Key("vishakha"), 40);
        map.put(new Key("vibhana"), 40);
        map.put(new Key("vaishi"), 40);
        map.put(new Key("vaishu"), 40);
        map.put(new Key("varah"), 40);
        map.put(new Key("viral"), 40);
        map.put(new Key("virus"), 40);
        map.put(new Key("vishnu"), 40);
        map.put(new Key("vishti"), 40);
        map.put(new Key("vishwatma"), 40);
        map.put(new Key("vishha"), 40);
        map.put(new Key("vastav"), 40);
        map.put(new Key("vastu"), 40);
        map.put(new Key("varu"), 40);
        map.put(new Key("veer"), 40);
        map.put(new Key("veet"), 40);
        map.put(new Key("veena"), 40);
        map.put(new Key("venkat"), 40);
        map.put(new Key("vimal"), 40);
        map.put(new Key("viral"), 40);
        for(int i=0;i<50; i++)
        {
        	String str = "vipul"+i;
        	map.put(new Key(str), 40);
        }
        System.out.println(); 
        System.out.println("Value for key sachin: " + map.get(new Key("sachin"))); 
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav"))); 
        System.out.println("Value for key vaibhav: " + map.get(new Key("viral"))); 
    } 
}
