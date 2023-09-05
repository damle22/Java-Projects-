package cloning;

public class Dog implements Cloneable{

	private String name;
	private int age;
	private String bread;
	
	public Dog(String name, int age, String bread) {
		
		this.name = name;
		this.age = age;
		this.bread = bread;
	}
	
	@Override
	public Dog clone() {
		
		try {
			
			Dog copy = (Dog) super.clone();
			
			return copy;
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Clone did not work");
		}
		return null;
	
		
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

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", bread=" + bread + "]";
	}
	
	
}
