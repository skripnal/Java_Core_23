package change_lesson_14;

import java.util.Objects;

public class Person implements Comparable<Person>{
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	public Person(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, id, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName);
	}
	@Override
	public int compareTo(Person o) {
		if (this.id > o.getId()) {
			return 1;
		}else if (this.id < o.getId()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}

