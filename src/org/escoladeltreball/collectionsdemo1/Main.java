/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author iaw46490689
 *
 */
public class Main {

	public static List<String> subLlista(List<String> list, String expresion) {
		List<String> subList = new LinkedList<>();
		for (String string: list) {
			if (string.matches("^" + expresion + ".*")) {
				subList.add(string);
			}
		}
		return subList;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// LinkedList es mas eficiente que ArrayList
		List<String> list = new LinkedList<>();
		
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulu");
		list.add("Albacete");
		list.add("Alava");

		list.remove("Charlie");
		
		Collections.sort(list);
		
		for (String string: list) {
			System.out.println(string);
		}
		
		System.out.println("-----------------");
		
		List<String> subLlista = subLlista(list, "Al");
		
		for (String string: subLlista) {
			System.out.println(string);
		}
	}

}
