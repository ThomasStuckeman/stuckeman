package exsample1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List li = new LinkedList();
		li.add("hello");
		li.add(122121);
		li.add(true);
		li.add(121212);
		li.add("string");
		li.add(null);
		li.add('c');
		System.out.println(li);

		List<Integer> li2 = new LinkedList<>();
		li2.add(23);
		li2.add(1232);
		li2.add(23232);
		li2.add(34343);
		li2.add(2323);
		li2.add(null);
		li2.add(23293923);
		System.out.println(li2);
		li2.add(2, 34);
		System.out.println(li2);
		System.out.println(li2.size());
		li2.set(0, 1000);
		System.out.println(li2);
		Integer i = 23232;
		li2.remove(i);
		System.out.println(li2);
		li2.remove(3);
		System.out.println(li2);

		System.out.println(li2.get(0));

		for (int j = 0; j < li2.size(); j++) {
			System.out.println(li2.get(j));

			List<Integer> li3 = new ArrayList<>(li2);
			System.out.println(li3);

			List<Integer> li4 = new ArrayList<>();
			li4.add(12121);
			li4.add(23232);
			li4.add(3343);
			li4.add(3434323);
			li4.add(34343);
			li4.add(34);

			Collections.replaceAll(li2, null, 22);
			System.out.println(li2);

			Collections.sort(li2); // merge/bucket
			System.out.println(li2);

			Collections.reverse(li2);
			System.out.println(li2);

			Collections.sort(li2, Collections.reverseOrder());
			System.out.println(li2);
			Collections.reverse(li2);
			System.out.println(li2);

			Collections.shuffle(li2);
			System.out.println(li2);

			Collections.sort(li2);
			System.out.println(Collections.binarySearch(li2, 2323));

			System.out.println(li2.contains(34));
			

		}

	}

}
