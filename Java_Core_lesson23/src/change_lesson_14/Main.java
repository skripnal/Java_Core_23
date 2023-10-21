package change_lesson_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		HashSet<Person> persons = new HashSet<Person>();
		//TreeSet<Person> persons = new TreeSet<Person>(new PersonComparator());
		
		persons.add(new Person(1, "Oleksandr", "Kripnichenko", 22));
		persons.add(new Person(1, "Oleksandr", "Skripnichenko", 23));
		persons.add(new Person(1, "Oleksandr", "Skripnichenko", 22));
		persons.add(new Person(2, "Oleksandr", "Moore", 22));
		persons.add(new Person(3, "Everly", "Barnes", 35));
		persons.add(new Person(4, "Kinslee", "Harris", 18));
		persons.add(new Person(5, "Brody", "Brown", 28));
		persons.add(new Person(6, "Uria", "Foster", 40));
		persons.add(new Person(7, "Wesley", "Rogers", 29));
		persons.add(new Person(8, "Warner", "Watson", 34));
		
		
		List<Person> list = new ArrayList<Person>(persons);
		System.out.println("Не відсортований список:");
		list.stream().forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("\nВідсортований список за допомогою Comparable:");
		list.stream().forEach(System.out::println);
		
		Collections.sort(list, new PersonComparator());
		
		System.out.println("\nВідсортований список за допомогою Comparator:");
		list.stream().forEach(System.out::println);
		
	}

}
