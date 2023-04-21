import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
public class CollectionTopic {

	public static void main(String[] args) {
		
		
		ArrayList<Object> list=new ArrayList<>(); 	
		list.add(10);
		list.add("hi");
		list.add("hi");
		list.add(20);
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		if(list.contains("hi"))
			System.out.println("present");
		else
			System.out.println("not present");
		
		list.remove(4);
		
		for(Object data:list)
		{
		System.out.println(data);
		}
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(40);
		list1.add(20);
		list1.add(50);
		Collections.sort(list1);
		System.out.println(list1);
		
		
		Iterator<Object> li=list.iterator();
		
		while(li.hasNext())
		{
			Object data1 = li.next();
			System.out.println(data1);
		}
		
		System.out.println(list.size());
		System.out.println(list1.size());
		System.out.println(list.get(3));
		System.out.println(list.indexOf("hi"));
		
		
		LinkedList<Integer> list2=new LinkedList<>();
		list2.add(10);
		list2.add(40);
		list2.add(20);
		list2.add(50);
		Collections.sort(list2);
		System.out.println(list2);
		
		
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.add(10);
		q.add(55);
		q.add(22);
		q.add(16);
		q.add(80);
		
		
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
		HashSet<Object> set=new HashSet<>(); 
		set.add("Deepak");
		set.add(null);
		set.add(201);
		set.add(50);
		set.add("hi");
		
		System.out.println(set);
		
		ArrayList<Object> list3=new ArrayList<>(set);
		list3.add(60);
		list3.add(80);
		list3.add("Welcome");
		list3.add(null);
		list3.add(null);
		list3.add(80);
		System.out.println(list3);
		
		
		LinkedHashSet<Object> lh=new LinkedHashSet<>();
		
		lh.add(10);
		lh.add("hi");
		lh.add("hi");
		lh.add(null);
		lh.add(50);
		lh.add(null);
		System.out.println(lh);
		
		ArrayList<Object> list4=new ArrayList<>(lh);
		
		list4.add(60);
		list4.add(80);
		list4.add("Welcome");
		list4.add(null);
		list4.add(null);
		list4.add(80);
		System.out.println(list4);
		
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(25);
		ts.add(26);
		ts.add(84);
		ts.add(77);
		ts.add(93);
		ts.add(15);
		ts.add(20);
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		Hashtable<Integer,String> map1=new Hashtable<>();
		map1.put(101, "Hello");
		map1.put(104, "good");
		map1.put(105, "evening");
		map1.put(103, "everyone");
		System.out.println(map1);
		
		
		HashMap<Integer,String> map2=new HashMap<>();
		map2.put(11, "Hello");
		map2.put(14, "good");
		map2.put(15, "evening");
		map2.put(13, "everyone");
		map2.put(30, null);
		map2.put(60, null);
		map2.put(30, "bye");
		map2.put(60, "bye");
		map2.put(20, null);
		
		for(Entry<Integer,String> entryset1:map2.entrySet())
		{
			System.out.println(entryset1.getKey()+"  "+entryset1.getValue());
		}
		System.out.println(map2.containsKey(30));
		System.out.println(map2.containsValue("evening"));
		System.out.println(map2.size());
		System.out.println(map2.replace(60, "virat kohli"));
		System.out.println(map2.remove(30));
		System.out.println(map2);
		
		LinkedHashMap<Integer,String> linkhm=new LinkedHashMap<>();
		linkhm.put(11, "Hello");
		linkhm.put(14, "good");
		linkhm.put(15, "evening");
		linkhm.put(13, "everyone");
		linkhm.put(30, null);
		linkhm.put(60, null);
		linkhm.put(30, "bye");
		linkhm.put(60, "bye");
		linkhm.put(20, null);
		
		for(Entry<Integer,String> entrySet2:linkhm.entrySet())
		{
			System.out.println(entrySet2.getKey()+"  "+entrySet2.getValue());
		}
		System.out.println(linkhm.containsKey(30));
		System.out.println(linkhm.containsValue("evening"));
		System.out.println(linkhm.size());
		System.out.println(linkhm.replace(60, "virat kohli"));
		System.out.println(linkhm.remove(30));
		System.out.println(linkhm);
		
		
		TreeMap<Integer,Object> tmap=new TreeMap<>();
		tmap.put(10, "Good");
		tmap.put(14, "hi");
		tmap.put(5, null);
		tmap.put(15, "to");
		tmap.put(10, "bye");
		tmap.put(15, 20);
		
		for(Entry<Integer,Object> entrySet3:tmap.entrySet())
		{
			System.out.println(entrySet3.getKey()+"  "+entrySet3.getValue());
		}
		System.out.println(tmap);
	}

}
