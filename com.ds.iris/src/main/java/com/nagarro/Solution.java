package com.nagarro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Solution {

	public static void main(final String[] args) {
		final String result = solution(
				"my.song.mp3 11b greatSong.flac 1000b not3.txt 5b video.mp4 200b game.exe 100b mov!e.mkv 10000b");
		System.out.println(result);
	}

	public static String solution(final String S) {
		// write your code in Java SE 8
		final HashMap<String, Integer> map = new HashMap<>();
		final String[] data = S.split(" ");
		for (int i = 0; i < data.length - 1; i = i + 2) {
			System.out.println(data[i]);
			System.out.println(data[i + 1]);
			System.out.println();
		}
		System.out.println("_____________________");
		for (int i = 0; i < data.length - 1; i = i + 2) {
			System.out.println("value of i>>>" + i);
			final int size = Integer.parseInt(data[i + 1].substring(0, data[i + 1].length() - 1));
			System.out.println(data[i]);
			System.out.println(size);
			System.out.println();
			if (data[i].endsWith(".mp3") || data[i].endsWith(".acc") || data[i].endsWith("flac")) {
				if (map.containsKey("music")) {
					map.put("music", map.get("music") + size);
				} else {
					map.put("music", size);
				}

			}

			else if (data[i].endsWith(".jpg") || data[i].endsWith(".bpm") || data[i].endsWith("gif")) {
				if (map.containsKey("image")) {
					map.put("image", map.get("image") + size);
				} else {
					map.put("image", size);
				}

			}

			else if (data[i].endsWith(".mp4") || data[i].endsWith(".avi") || data[i].endsWith("mkv")) {
				if (map.containsKey("movie")) {
					map.put("movie", map.get("movie") + size);
				} else {
					map.put("movie", size);
				}

			}

			else {
				if (map.containsKey("others")) {
					map.put("others", map.get("others") + size);
				} else {
					map.put("others", size);
				}

			}
			System.out.println(map);
		}
		System.out.println(map);
		final Set<String> s = map.keySet();
		final Iterator<String> itr = s.iterator();
		String result = "";
		while (itr.hasNext()) {
			final String key = itr.next();
			final String value = "" + map.get(key);
			System.out.print("key  " + key);
			System.out.print(map.get(key));

			result += "  " + key + "   " + value;

		}

		return result;
	}

}
