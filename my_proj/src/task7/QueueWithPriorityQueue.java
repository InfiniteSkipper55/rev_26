package task7;

import java.util.Objects;

public class QueueWithPriorityQueue implements Comparable<QueueWithPriorityQueue> {
	
	private int id;
	private String name;
	private int age;
	
	public QueueWithPriorityQueue(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "QueueWithPriorityQueue [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueueWithPriorityQueue other = (QueueWithPriorityQueue) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(QueueWithPriorityQueue o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
