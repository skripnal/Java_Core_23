package change_lesson_14_max;

import java.util.Objects;

public class Commodity {
	
	private int id;
	private String name;
	private int length;
	private int width;
	private int weight;
	

	public Commodity(int id, String name, int length, int width, int weight) {
		this.id = id;
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", length=" + length + ", width=" + width + ", weight="
				+ weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, length, name, weight, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		return id == other.id && length == other.length && Objects.equals(name, other.name) && weight == other.weight
				&& width == other.width;
	}
	
	
}
