package change_lesson_13;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Faction faction1 = new Faction("Фракція1");
		faction1.addDeputy(new Deputy(90, 185, "Олександр", "Петренко", 38, false));
		faction1.addDeputy(new Deputy(120, 178, "Григорій", "Григоренко", 52, true));
		faction1.addDeputy(new Deputy(80, 175, "Іван", "Петренко", 50, true));
		faction1.addDeputy(new Deputy(76, 168, "Марія", "Іванова", 38, true));
		faction1.addDeputy(new Deputy(85, 180, "Олег", "Коваль", 55, false));
		faction1.addDeputy(new Deputy(70, 160, "Наталія", "Сидоренко", 42, true));
		faction1.addDeputy(new Deputy(78, 173, "Андрій", "Григорович", 48, false));
		faction1.addDeputy(new Deputy(82, 172, "Людмила", "Захаренко", 41, true));
		faction1.addDeputy(new Deputy(75, 170, "Оксана", "Кузьменко", 37, false));
		faction1.addDeputy(new Deputy(88, 185, "Ігор", "Дмитренко", 53, true));
		faction1.addDeputy(new Deputy(72, 163, "Тарас", "Мельниченко", 47, false));
		
		
		Faction faction2 = new Faction("Фракція2");
		faction2.addDeputy(new Deputy(80, 175, "Іван", "Петренко", 50, true));
		faction2.addDeputy(new Deputy(76, 168, "Марія", "Іванова", 38, true));
		faction2.addDeputy(new Deputy(85, 180, "Олег", "Коваль", 55, false));
		faction2.addDeputy(new Deputy(70, 160, "Наталія", "Сидоренко", 42, true));
		faction2.addDeputy(new Deputy(78, 173, "Андрій", "Григорович", 48, false));
		faction2.addDeputy(new Deputy(82, 172, "Людмила", "Захаренко", 41, true));
		faction2.addDeputy(new Deputy(75, 170, "Оксана", "Кузьменко", 37, false));
		faction2.addDeputy(new Deputy(88, 185, "Ігор", "Дмитренко", 53, true));
		faction2.addDeputy(new Deputy(72, 163, "Тарас", "Мельниченко", 47, false));
		

		Faction faction3 = new Faction("Фракція3");
		faction3.addDeputy(new Deputy(74, 170, "Петро", "Василенко", 44, false));
		faction3.addDeputy(new Deputy(80, 175, "Іван", "Петренко", 50, true));
		faction3.addDeputy(new Deputy(68, 165, "Марія", "Іванова", 38, false));
		faction3.addDeputy(new Deputy(72, 168, "Олег", "Коваль", 42, true));
		
		
		Rada.getInstance().addFaction(faction1);
		Rada.getInstance().addFaction(faction2);
		Rada.getInstance().addFaction(faction3);
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("_______________________________________________________");
			System.out.println(" 1 - Додати фракцію");
			System.out.println(" 2 - Видалити фракцію");
			System.out.println(" 3 - Ввивести список фракцій");
			System.out.println(" 4 - Очистити фракцію");
			System.out.println(" 5 - Вивести список депутатів фракції");
			System.out.println(" 6 - Додати депутата до фракції");
			System.out.println(" 7 - Видалити депутата з фракції");
			System.out.println(" 8 - Вивести список хабарників фракції");
			System.out.println(" 9 - Вивести найбільшого хабарника фракції");
			System.out.println("10 - Вивести список хабарників всіх фракцій");
			System.out.println(" 0 - Закінчення виконання програми");
			System.out.println("_______________________________________________________");
			
			switch (scanner.nextInt()) {
				case 1: {
					Rada.getInstance().addFaction();
					break;
				}
				case 2: {
					Rada.getInstance().removeFaction();
					break;
				}
				case 3: {
					Rada.getInstance().showFactions();
					break;
				}
				case 4: {
					Rada.getInstance().removeAllDeputy();
					break;
				}
				case 5: {
					Rada.getInstance().factionInfo();
					break;
				}
				case 6: {
					Rada.getInstance().addDeputy();
					break;
				}
				case 7: {
					Rada.getInstance().removeDeputy();
					break;
				}
				case 8: {
					Rada.getInstance().showBribers();
					break;
				}
				case 9: {
					Rada.getInstance().showBigestBribers();
					break;
				}
				case 10: {
					Rada.getInstance().showAllBribers();
					break;
				}
				case 0:{
					flag = false;
					break;
				}
				default: {
					System.out.println("Невірно вказана операція!");
				}
			
			}
			
		}
	}

}
