package com.ds.ciena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class LruCache {

	public static void LRU(final List<Integer> list) {
		final HashMap<Integer, Integer> hashMap = new HashMap<>();
		final TreeMap<Integer, Integer> tmap = new TreeMap<>((o1, o2) -> {
			final int key1 = o1;
			final int key2 = o2;
			final int value1 = hashMap.get(key1);
			final int value2 = hashMap.get(key2);
			return value1 - value2;
		});
		final List<Integer> cache = new ArrayList<>();
		int number = 0;
		final Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			final Integer key = iterator.next();
			System.out.println("value demand is :::::::::" + key);
			System.out.println("cache current elements ::" + cache);
			number = number + 1;
			if (cache.contains(key)) {

				hashMap.put(key, number);
			} else {
				if (cache.size() >= 3) {
					tmap.clear();
					tmap.putAll(hashMap);
					System.out.println("HashMap is ::" + hashMap);
					System.out.println("TreeMap is ::" + tmap);

					final int lastPage = tmap.firstKey();
					cache.remove(new Integer(lastPage));
					hashMap.remove(lastPage);
					cache.add(key);
					hashMap.put(key, number);
				} else {
					cache.add(key);
					hashMap.put(key, number);
				}
			}
			System.out.println("final cache current elements ::" + cache);
			System.out.println();
		}
	}

	public static void LruCache(final List<Integer> list, final int size) {
		final Deque<Integer> deque = new LinkedList<>();
		final HashSet<Integer> set = new HashSet<>();
		for (final Integer demand : list) {
			System.out.println("Elelemt in demand :::" + demand);
			System.out.println("Element in cache is :" + deque);
			if (set.contains(demand)) {
				deque.remove(demand);
				deque.addFirst(demand);
			} else {
				if (deque.size() >= size) {
					final Integer removeLast = deque.removeLast();
					set.remove(removeLast);
				}
				deque.addFirst(demand);
				set.add(demand);
			}
			System.out.println("final cache current elements ::" + deque);
			System.out.println("final set current elements ::" + set);
			System.out.println();
		}
	}

	public static void main(final String[] args) {
		final List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5);
		// LRU(list);
		LruCache(list, 3);
	}

}
