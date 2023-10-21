package change_lesson_13;

import java.util.Objects;

public class Human {
	private int weight;
	private int height;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Human(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(height, weight);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return height == other.height && weight == other.weight;
	}
	
	@Override
	public String toString() {
		return "Human [weight=" + weight + ", height=" + height + "]";
	}
	
	
}
