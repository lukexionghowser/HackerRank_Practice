package One;

class Person {
	String name;
	int age;
	
	void speak() {
		System.out.print("My name is " + name);
	}
	
	int calculateYearsToretirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
}

public class getter {
	public static void main(String[]args) {
		Person person1 = new Person();
		
		person1.name = "John";
		person1.age=30;
		
		//person1.speak()
		
		int years = person1.calculateYearsToretirement();
		System.out.println("Years until retirement: " + years);
	
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
	
	}
}
