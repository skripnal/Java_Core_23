package change_lesson_14_max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CommodityArray {
	
	private List<Commodity> list = new ArrayList<Commodity>();
	Random random = new Random();
	
	public void addCommodity(int x) {
		for (int i = 0; i < x; i++) {
			this.list.add(new Commodity(this.list.size(), "Товар "+this.list.size(), random.nextInt(90)+10, random.nextInt(90)+10, random.nextInt(50)+10));			
		}
	}
	
	public void remove(int i) {
		this.list.remove(i);
	}
	
	public void showCommodityArray() {
		System.out.println("Список товарів:");
		list.stream().forEach(System.out::println);
		System.out.println();
	}
	
	public void replaceCommodity(int i) {
		this.list.set(i, new Commodity(i, "Замінений товар", random.nextInt(90)+10, random.nextInt(90)+10, random.nextInt(50)+10));
	}

	public void showCommodity(int i) {
		System.out.println("Товар:");
		System.out.println(list.get(i));
	}
	
	public void sortBy(Comparator<Commodity> comparator, String message) {
        list.sort(comparator);
        System.out.println("Відбулося сортування " + message + "\n");
    }

    public void sortByName() {
        sortBy(Comparator.comparing(Commodity::getName), "за назвою");
    }

    public void sortByLength() {
        sortBy(Comparator.comparingInt(Commodity::getLength), "за довжиною");
    }

    public void sortByWidth() {
        sortBy(Comparator.comparingInt(Commodity::getWidth), "за шириною");
    }

    public void sortByWeight() {
        sortBy(Comparator.comparingInt(Commodity::getWeight), "за вагою");
    }
}
