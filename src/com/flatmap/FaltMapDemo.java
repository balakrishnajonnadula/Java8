package com.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FaltMapDemo {

	public static void main(String[] args) {
//		using map
//		List<Integer> l = Arrays.asList(20, 30, 40, 78, 41, 33);
//		l.stream().filter(i-> i% 2==0).forEach(System.out::println);
		List<String> team1 = Arrays.asList("Vali", "Hanuma", "Jambava", "Sugriva");
		List<String> team2 = Arrays.asList("Rama", "Lakshmana");
		List<String> team3 = Arrays.asList("Ravana", "Lankini", "Kumbakarna");
		List<List<String>> playerNames = new ArrayList<List<String>>();
		playerNames.add(team1);
		playerNames.add(team2);
		playerNames.add(team3);
		List<String> name1 = playerNames.stream().flatMap(t -> t.stream()).collect(Collectors.toList());
		System.out.println(name1);
		System.out.println();

		
//		Same example without java8
		System.out.print("[ ");
		for (List<String> tem : playerNames) {
			for (String name : tem) {
				System.out.print(name + ", ");
			}
		}
		System.out.println("]");
	}

}
