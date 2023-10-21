package change_lesson_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;


public class Faction {
	private String factionName;
	private ArrayList<Deputy> deputyList;
	
	public Faction(String factionName) {
		super();
		this.factionName = factionName;
		this.deputyList = new ArrayList<Deputy>();
	}
	
	public void addDeputy (Deputy deputy) {
		this.deputyList.add(deputy);
	}
	
	public void addDeputy(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть наступні поля: вага, ріст, ім'я, прізвище, вік, хабарник чи ні.");
		this.deputyList.add(new Deputy(scanner.nextInt(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextBoolean()));
	}
	
	public void removeDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть прізвище депутата котрого хочете видалити: ");
		String deputyToRemove = scanner.next();
		boolean removed = deputyList.removeIf(deputy -> deputy.getLastName().equals(deputyToRemove));
		if (removed) {
	        System.out.println("Депутат був видалений з фракції");
	    } else {
	        System.out.println("Депутата не знайдено.");
	    }
	}
	
	public void showFaction() {
		deputyList.forEach(System.out::println);
	}
	
	public void showBribers() {
		deputyList.stream().filter(Deputy::isBriber).forEach(System.out::println);
	}
	
	public void showBigestBriber() {
		deputyList.stream().filter(Deputy::isBriber).max(Comparator.comparingInt(Deputy::getSizeOfBribe));
	}
	
	public void removeAllDeputy() {
		deputyList.removeAll(deputyList);
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deputyList, factionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faction other = (Faction) obj;
		return Objects.equals(deputyList, other.deputyList) && Objects.equals(factionName, other.factionName);
	}

	@Override
	public String toString() {
		return "Faction [factionName=" + factionName + ", deputyList=" + deputyList + "]";
	}
	
	
}
