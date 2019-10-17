package programming.practice.chapter11.collection_framework;

public class Person implements Comparable<Person> {
	
	private String name;
	private Integer age;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return o.age.compareTo(this.age);
	}
	


}
