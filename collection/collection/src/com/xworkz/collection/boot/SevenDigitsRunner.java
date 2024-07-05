package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SevenDigitsRunner {
	
	public static void main(String[] args) {

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				if (a % 10 > b % 10) {
					return 1;
				}
				return -1;
			}
		};

		List<Integer> list = new ArrayList<Integer>();

		list.add(3787389);
		list.add(1712781);
		list.add(2776377);
		list.add(4748236);

		Collections.sort(list, comparator);

		for (Integer inte : list) {
			System.out.println(inte);
		}

	}

}



