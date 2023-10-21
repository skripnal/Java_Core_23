package change_lesson_13;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;



public class Rada {

	private static Rada instance;
	private ArrayList<Faction> factionList;
	
	
	private Rada() {
		factionList = new ArrayList<Faction>();
	}
	
	public static Rada getInstance() {
		if (instance == null) {
			instance = new Rada();
		}
		return instance;
	}
	
	// Додавання фракції
	public void addFaction(Faction a) {
		this.factionList.add(a);
	}
	
	// Додавання фракції
	public void addFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть назву фракції: ");
		this.factionList.add(new Faction(scanner.next()));
	}
	
	// Видалення фракції 
	public void removeFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть назву фракції яку хочете видалити: ");
		String temp = scanner.next();
		boolean removed = factionList.removeIf(Faction -> Faction.getFactionName().equals(temp));
		if (removed) {
			System.out.println("Фракція була видалена");
		}else {
			System.out.println("Фракції не знайдено");
		}
	}
	
	// Виведення списку фракцій на консоль
	public void showFactions() {
		factionList.stream().forEach(System.out::println);
	}
	
	// Виведення списку депутатів фракції 
	public void factionInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть назву фракції щоб вивести всіх її депутатів: ");
		String temp = scanner.next();
		Optional<Faction> faction = factionList.stream().filter(f -> f.getFactionName().equals(temp)).findFirst();
		if(faction.isPresent()) {
			faction.get().showFaction();
		}else {
			System.out.println("Фракції не знайдено");
		}
	}
	
	// Додавання депутата до фракції  
	public void addDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть назву фракції до котрої буде додано депутата: ");
		String temp = scanner.next();
		Optional<Faction> faction = factionList.stream().filter(f -> f.getFactionName().equals(temp)).findFirst();
		if(faction.isPresent()) {
			faction.get().addDeputy();
		}else {
			System.out.println("Фракції не знайдено");
		}
	}
	
	// Видалення депутата з фракції
	public void removeDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть назву фракції з котрої буде видалено депутата: ");
		String temp = scanner.next();
		Optional<Faction> faction = factionList.stream().filter(f -> f.getFactionName().equals(temp)).findFirst();
		if(faction.isPresent()) {
			faction.get().removeDeputy();
		}else {
			System.out.println("Фракції не знайдено");
		}
	}
	
	//  Виведення хабарників фракції
	public void showBribers() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть назву фракції хабарників якої буде виведено: ");
		String temp = scanner.next();
		Optional<Faction> faction = factionList.stream().filter(f->f.getFactionName().equals(temp)).findFirst();
		if(faction.isPresent()) {
			faction.get().showBribers();
		}else {
			System.out.println("Фракції не знайдено.");
		}
	}
	
	// Виведення найбільшого хабарника фракції
	public void showBigestBribers() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть назву фракції найбільшого хабарника якої буде виведено: ");
		String temp = scanner.next();
		Optional<Faction> faction = factionList.stream().filter(f->f.getFactionName().equals(temp)).findFirst();
		if(faction.isPresent()) {
			faction.get().showBigestBriber();
		}else {
			System.out.println("Фракції не знайдено.");
		} 
	}
	
	
	// Очищення фракції
	public void removeAllDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть назву фракції всі депутати якої будуть видалені: ");
		String temp = scanner.next();
		Optional<Faction> faction = factionList.stream().filter(f->f.getFactionName().equals(temp)).findFirst();
		if(faction.isPresent()) {
			faction.get().removeAllDeputy();
		}else {
			System.out.println("Фракції не знайдено.");
		} 
	}
	
	// Вивід всіх хабарників в раді
	public void showAllBribers() {
		factionList.forEach(Faction::showBribers);
	}
	
}
