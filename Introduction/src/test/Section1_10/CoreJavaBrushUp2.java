package test.Section1_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
	// LESSON 23
	public static void main(String[] args) {

		int[] arr2 = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

		// Obiettivo: stampare 2, 4, 6, 8, 10, 122

		// Controllo se l'array contiene multipli di 2
		for (int i = 0; i < arr2.length; i++) {

			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				// break; // Nota: Se lasci 'break', il ciclo si ferma al primo numero pari
				// trovato (il 2)
			} else {
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}

		// lesson 26

		ArrayList<String> a = new ArrayList<String>();

		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");

		System.out.println(a.get(3));

		System.out.println(a.get(3));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("**************");

		for (String val : a) {
			System.out.println(val);
		}

		// item is present in ArrayList
		System.out.println(a.contains("selenium"));

		String[] name = { "rahul", "shetty", "selenium" };
		List<String> nameArrayList = Arrays.asList(name);

		nameArrayList.contains("selenium");

	}
}