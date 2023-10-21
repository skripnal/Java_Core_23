package change_lesson_13;

import java.util.Objects;
import java.util.Scanner;

public class Deputy extends Human{

	private String firstName;
	private String lastName;
	private int age;
	private boolean isBriber;
	private int sizeOfBribe;
	
	public Deputy(int weight, int height, String firstName, String lastName, int age, boolean isBriber) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isBriber = isBriber;
	}
	
	
	public void giveBribe(int size) {
		if (!this.isBriber) {
			System.out.println("Цей депутат не бере хабарів");
		}else {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введіть суму хабаря яку хочете дати: ");
			int bribe = scanner.nextInt();
			if (bribe > 5000) {
				System.out.println("Поліція ув'язнить депутата");
			}else {
				this.sizeOfBribe += bribe; 
			}
		}
	}
	
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBriber() {
		return isBriber;
	}

	public void setBriber(boolean isBriber) {
		this.isBriber = isBriber;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age, firstName, isBriber, lastName, sizeOfBribe);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputy other = (Deputy) obj;
		return age == other.age && Objects.equals(firstName, other.firstName) && isBriber == other.isBriber
				&& Objects.equals(lastName, other.lastName) && sizeOfBribe == other.sizeOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", isBriber=" + isBriber
				+ ", sizeOfBribe=" + sizeOfBribe + "]";
	}
	
	

}
