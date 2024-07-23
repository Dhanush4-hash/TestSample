package Maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class FindingDuplicateElements {

	@Test
	public void findingDuplicateElementsInList() {
		List<Object> myList = List.of("Dhanush", "Dhanush", "Qspiders", "testing");
		HashSet<Object> duplicates = new HashSet<Object>(myList);
		for (Object duplicate : duplicates) {
			System.out.print(duplicate);
			System.out.print(" Occurrences: ");
			System.out.println(Collections.frequency(myList, duplicate));
		}
	}

	@Test
	public void findCommonElements() {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hi");
		list1.add("dhanush");
		list1.add("dhanush");
		list1.add("manual");
		list1.add("automation");
		System.out.println(list1);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("testNg");
		list2.add("manual");
		list2.add("automation");
		System.out.println(list2);
		list1.retainAll(list2);
		System.out.println(list1);
		int list1Size = list1.size();
		System.out.println("list1Size is :"+list1Size);
	}

	
	@Test
	public void verifyScannerClass() {
		int num;
        System.out.println("Enter the integer: ");
        Scanner s = new Scanner(System.in);
		num=s.nextInt();
		 System.out.println("Entered integer is: "
                 + num);
	}
	
}