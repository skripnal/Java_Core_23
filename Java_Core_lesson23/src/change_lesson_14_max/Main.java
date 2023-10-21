package change_lesson_14_max;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		
		CommodityArray arr1 = new CommodityArray();
		Scanner scanner = new Scanner(System.in);
		int key;
		
		while (true) {
			System.out.println("1 - Додати товар");
			System.out.println("2 - Видалити товар");
			System.out.println("3 - Вивести список товарів");
			System.out.println("4 - Замінити товар");
			System.out.println("5 - Сортувати за назвою");
			System.out.println("6 - Сортувати за довжиною");
			System.out.println("7 - Сортувати за шириною");
			System.out.println("8 - Сортувати за вагою");
			System.out.println("9 - Вивести і-тий товар на консоль");
			System.out.println("0 - Припинити виконання програми");
			
			try {
				key = scanner.nextInt();				
			} catch (InputMismatchException e) {
				System.out.println("-----Невірна команда-----\n");
				scanner.nextLine();
				continue;
			}
			
			switch (key) {
			case 1: {
				System.out.println("\nВведіть кількість згенерованих товарів");
				try {
					arr1.addCommodity(scanner.nextInt());					
				} catch (InputMismatchException e) {
					System.out.println("-----Невірна команда-----\n");
					scanner.nextLine();
				}
				break;
			}
			case 2: {
				System.out.println("Введіть id товару який хочете видалити");
				try {
					arr1.remove(scanner.nextInt());					
				} catch (InputMismatchException e) {
					System.out.println("-----Невірна команда-----\n");
					scanner.nextLine();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("-----Вихід за рамки масиву-----\n");
					scanner.nextLine();
				}
				break;
			}
			case 3: {
				arr1.showCommodityArray();
				break;
			}
			case 4: {
				System.out.println("Введіть id товару який хочете замінити");
				try {
					arr1.replaceCommodity(scanner.nextInt());					
				} catch (InputMismatchException e) {
					System.out.println("-----Невірна команда-----\n");
					scanner.nextLine();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("-----Вихід за рамки масиву-----\n");
					scanner.nextLine();
				}
				break;
			}
			case 5: {
				arr1.sortByName();
				break;
			}
			case 6: {
				arr1.sortByLength();
				break;
			}
			case 7: {
				arr1.sortByWidth();
				break;
			}
			case 8: {
				arr1.sortByWeight();
				break;
			}
			case 9: {
				try {
					arr1.showCommodity(scanner.nextInt());			
				} catch (InputMismatchException e) {
					System.out.println("-----Невірна команда-----\n");
					scanner.nextLine();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("-----Вихід за рамки масиву-----\n");
					scanner.nextLine();
				}
				break;
			}
			case 0: {
				System.exit(0);
				break;
			}
			default:
				System.out.println("Невірна команда");
				break;
			}			
		}
	}
	
}
